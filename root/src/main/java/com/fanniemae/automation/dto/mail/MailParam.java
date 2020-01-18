package com.fanniemae.automation.dto.mail;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.util.PropertyUtil;

/**
 * 
 * @author TO-WVLD-12
 *
 */
public class MailParam {

	private String subject;
	private String bodyText;
	private List<Attachment> attachments;
	
	private MailConfig mailConfig;
	
	public MailParam() {
		mailConfig = new MailConfig();
		this.subject = PropertyUtil.getString(FanniemaeConstants.MAIL_SUBJECT) + new SimpleDateFormat(FanniemaeConstants.DD_MM_YYYY).format(new Date());
		this.bodyText = PropertyUtil.getString(FanniemaeConstants.MAIL_BODY_TEXT);
		
	}
	
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public MailParam(List<Attachment> attachments) {
		this();
		this.attachments = attachments;
	}
	
	public String getSubject() {
		return subject;
	}

	public String getBodyText() {
		return bodyText;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public MailConfig getMailConfig() {
		return mailConfig;
	}

	public final class MailConfig{
		
		private String username;
		private String passcode;
		private InternetAddress from;
		private InternetAddress[] to;
		private String host;
		private String port;
		private String startTLS;
		private String smtpAuth;
		
		private boolean isMailTransportable; 
		
		public MailConfig() {
			username = PropertyUtil.getString(FanniemaeConstants.MAIL_USER);
			passcode = PropertyUtil.getString(FanniemaeConstants.MAIL_PASS);
			from = initFrom();
			host = PropertyUtil.getString(FanniemaeConstants.MAIL_HOST);
			port = PropertyUtil.getString(FanniemaeConstants.MAIL_PORT);
			to = initTo();
			startTLS = PropertyUtil.getString(FanniemaeConstants.MAIL_SMTP_TLS_ENABLE);
			smtpAuth = PropertyUtil.getString(FanniemaeConstants.MAIL_SMTP_AUTH);
			isMailTransportable = initTransportPermission();
		}

		private InternetAddress initFrom() {
			try {
				return new InternetAddress(PropertyUtil.getString(FanniemaeConstants.MAIL_FROM));
			}catch(AddressException e) {
				throw new IllegalArgumentException("Error occured while parsing the TO receipents");
			}
		}
		
		private InternetAddress[] initTo() {
			String[] mails = PropertyUtil.getString(FanniemaeConstants.MAIL_TO).split(",");
			InternetAddress[] addresses = new InternetAddress[mails.length];
			for(int i=0; i<mails.length; i++) {
				try {
					addresses[i] = new InternetAddress(mails[i]);
				} catch (AddressException e) {
					throw new IllegalArgumentException("Error occured while parsing the TO receipents");
				}
			}
			return addresses;
		}
		
		private boolean initTransportPermission() {
			String permission = PropertyUtil.getString(FanniemaeConstants.MAIL_IS_TRANSPORTABLE, "N");
			return (permission.equalsIgnoreCase("Y") || permission.equalsIgnoreCase("true")) ? Boolean.TRUE.booleanValue() : Boolean.FALSE.booleanValue();
		}
		
		public String getUsername() {
			return username;
		}

		public String getPasscode() {
			return passcode;
		}

		public InternetAddress getFrom() {
			return from;
		}

		public InternetAddress[] getTo() {
			return to;
		}

		public String getHost() {
			return host;
		}

		public String getPort() {
			return port;
		}

		public String getStartTLS() {
			return startTLS;
		}

		public String getSmtpAuth() {
			return smtpAuth;
		}

		public boolean isMailTransportable() {
			return isMailTransportable;
		}

		@Override
		public String toString() {
			return "MailConfig [username=" + username + ", passcode=" + passcode + ", from=" + from + ", to="
					+ Arrays.toString(to) + ", host=" + host + ", port=" + port + ", startTLS=" + startTLS
					+ ", smtpAuth=" + smtpAuth + ", isMailTransportable=" + isMailTransportable + "]";
		}
	}

	@Override
	public String toString() {
		return "MailParam [subject=" + subject + ", bodyText=" + bodyText + ", attachments=" + attachments
				+ ", mailConfig=" + mailConfig + "]";
	}
}
