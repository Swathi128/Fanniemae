package com.fanniemae.automation.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.log4j.Logger;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.dto.mail.MailParam;
import com.fanniemae.automation.dto.mail.MailParam.MailConfig;
import com.fanniemae.automation.dto.testcase.SuiteResult;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class DefaultMailService {
	
	private MailParam mailParam;
	private MailConfig config;
	private SuiteResult suiteResult;
	private DefaultMailServiceHelper helper;
	
	private static final Logger LOG =Logger.getLogger(DefaultMailService.class.getName());
	
	public DefaultMailService(MailParam mailParam, SuiteResult suiteResult) {
		super();
		this.mailParam = mailParam;
		config = mailParam.getMailConfig();
		this.suiteResult = suiteResult;
		helper = new DefaultMailServiceHelper();
	}
	
	public void transport() {
		if (helper.isMandateDataAvailable(mailParam, suiteResult)) {
			Session session = Session.getDefaultInstance(helper.getMailProperties(config));
			MimeMessage message = new MimeMessage(session);
			try {
				message.setFrom(config.getFrom());
				message.addRecipients(Message.RecipientType.TO, config.getTo());
				message.setSubject(mailParam.getSubject());
				Multipart multipart = new MimeMultipart();
				helper.setBodyText(multipart, suiteResult);
				helper.attachBodyParts(multipart, mailParam.getAttachments());
				message.setContent(multipart);
				Transport transport = session.getTransport(FanniemaeConstants.SMTP);
				transport.connect(config.getHost(), config.getFrom().toString(),
						config.getPasscode());
				transport.sendMessage(message, message.getAllRecipients());
				transport.close();
				LOG.info("Mail Sent.");
			} catch (AddressException e) {
				LOG.error("Error occurred with an email addresses supplied are not valid or not active", e);
			} catch (MessagingException e) {
				LOG.error("Error occurred while sending an mail.", e);
			} catch (Exception e) {
				LOG.error("Unknown error occurred while sending email.",e);
			}
		}else {
			LOG.warn("Mail cannot be sent due to lack of mandatory data/permissions. Validation of "+mailParam+" and "+suiteResult+" failed and results in non transporatable mail.");
		}
	}
}