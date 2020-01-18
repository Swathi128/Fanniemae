package com.fanniemae.automation.mail;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;

import com.fanniemae.automation.dto.mail.Attachment;
import com.fanniemae.automation.dto.mail.MailParam;
import com.fanniemae.automation.registry.Registry;
import com.fanniemae.automation.registry.RegistryKey;
import com.fanniemae.automation.util.PathProvider;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class MailContentPreparer {
	
	private static final Logger LOG = Logger.getLogger(MailContentPreparer.class.getName());
	
	public MailParam prepare(){
		LOG.debug("Prearing mail content.");
		Object obj = Registry.getAttribute(RegistryKey.MAIL_PARAM);
		MailParam mailParam = (Objects.nonNull(obj)) ? ((MailParam)obj) : new MailParam();
		mailParam.setAttachments(getAttachments());
		Registry.setAttribute(RegistryKey.MAIL_PARAM, mailParam);
		return mailParam;
	}

	private List<Attachment> getAttachments(){
		Object obj = Registry.getAttribute(RegistryKey.PDF_REPORT_FILE_PATH);
		Path path = (Objects.nonNull(obj)) ? ((Path)obj) : PathProvider.getGenPDFReportFilePath((String)Registry.getAttribute(RegistryKey.DIR_TIMESTAMP_SUFFIX));
		return Arrays.asList(new Attachment(path,path.getFileName()));
	}
}