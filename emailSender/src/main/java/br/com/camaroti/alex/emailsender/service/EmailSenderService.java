package br.com.camaroti.alex.emailsender.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	public void emailSender(final String name, final String emailReceiver) {
		try {
			final Email emailDestiny = new SimpleEmail();

			emailDestiny.setHostName("smtp.googlemail.com");
			emailDestiny.setSmtpPort(465);
			emailDestiny.setAuthenticator(new DefaultAuthenticator("enteryouremail@email.com", "enteryourpassword"));
			emailDestiny.setSSLOnConnect(true);

			emailDestiny.setFrom("enteryouremail@email.com");
			emailDestiny.setSubject("A big reward to you");
			emailDestiny.setMsg("Hello" + name + ". You are invited by VIPList!");
			emailDestiny.addTo(emailReceiver);
			emailDestiny.send();

		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
