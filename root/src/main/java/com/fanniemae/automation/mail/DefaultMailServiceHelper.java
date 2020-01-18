package com.fanniemae.automation.mail;

import java.util.List;
import java.util.Objects;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.dto.mail.Attachment;
import com.fanniemae.automation.dto.mail.MailParam;
import com.fanniemae.automation.dto.mail.MailParam.MailConfig;
import com.fanniemae.automation.dto.testcase.SuiteResult;
import com.fanniemae.automation.util.PropertyUtil;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class DefaultMailServiceHelper {

	public static final String TOTAL_TEST_CASES_EXECUTED = "{TOTAL_TEST_CASES_EXECUTED}";
	public static final String TEST_CASES_PASSED = "{TEST_CASES_PASSED}";
	public static final String TEST_CASES_FAILED = "{TEST_CASES_FAILED}";
	
	private BodyPart bodyPart; 
	
	private static final Logger LOG = Logger.getLogger(DefaultMailServiceHelper.class.getName());
	
	public boolean isAttachmentsAvailable(MailParam mailParam) {
		return (Objects.nonNull(mailParam)) ? isAttachmentsAvailable(mailParam.getAttachments()) : Boolean.FALSE.booleanValue();
	}
	
	public boolean isAttachmentsAvailable(List<Attachment> attachments) {
		return (Objects.nonNull(attachments) && !attachments.isEmpty()) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
	}
	
	public String getBodyText(SuiteResult suiteResult) {
		return PropertyUtil.getString(FanniemaeConstants.MAIL_BODY_TEXT).replace(TOTAL_TEST_CASES_EXECUTED, String.valueOf(suiteResult.getTotatlTestCasesExecuted()))
				.replace(TEST_CASES_PASSED, String.valueOf(suiteResult.getPassedTestCases())).replace(TEST_CASES_FAILED, String.valueOf(suiteResult.getFailedTestCases()));
	}
	
	public boolean isMandateDataAvailable(MailParam mailParam, SuiteResult suiteResult) {
		LOG.debug("Validating "+mailParam+" and "+suiteResult);
		return (Objects.isNull(mailParam) || Objects.isNull(suiteResult) || StringUtils.isBlank(mailParam.getBodyText()) || !mailParam.getMailConfig().isMailTransportable()) ? Boolean.FALSE.booleanValue() : Boolean.TRUE.booleanValue();
	}

	public Properties getMailProperties(MailConfig config) {
		Properties props = System.getProperties();
		props.put(FanniemaeConstants.MAIL_SMTP_TLS_ENABLE, config.getStartTLS());
		props.put("mail.smtp.host", config.getHost());
		props.put("mail.smtp.user", config.getFrom().toString());
		props.put("mail.smtp.password", config.getPasscode());
		props.put("mail.smtp.port", config.getPort());
		props.put(FanniemaeConstants.MAIL_SMTP_AUTH, config.getSmtpAuth());
		return props;
	}
	
	public void attachBodyParts(Multipart multipart, List<Attachment> attachments) throws MessagingException {
		if(Objects.nonNull(multipart) && isAttachmentsAvailable(attachments)) {
			for(Attachment attachment : attachments) {
				bodyPart = new MimeBodyPart();
				bodyPart.setDataHandler(new DataHandler(new FileDataSource(attachment.getPath().toString())));
				bodyPart.setFileName(attachment.getConfigurableName().toString());
				multipart.addBodyPart(bodyPart);
			}
		}else {
			LOG.debug("No Attachment(s) available to attach."+attachments);
		}
		}
	
	public void setBodyText(Multipart multipart, SuiteResult suiteResult) throws MessagingException {
		bodyPart = new MimeBodyPart();
		bodyPart.setText(getBodyText(suiteResult));
		multipart.addBodyPart(bodyPart);
	}
}