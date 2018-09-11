package br.com.camaroti.alex.emailSender.emailSender.service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	public void emailSender(String name, String emailReceiver) {
		try {
			Email emailDestiny = new SimpleEmail();
			
			emailDestiny.setHostName("smtp.googlemail.com");
			emailDestiny.setSmtpPort(465);
			emailDestiny.setAuthenticator(new DefaultAuthenticator("duvalkin.salazar@gmail.com", "11011994"));
			emailDestiny.setSSLOnConnect(true);
			
			emailDestiny.setFrom("duvalkin.salazar@gmail.com");
			emailDestiny.setSubject("A big reward to you");
			emailDestiny.setMsg("Hello" + name + ". You are invited by VIPList!");
			emailDestiny.addTo(emailReceiver);
			emailDestiny.send();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
