package com.iran.projetodesweb.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.iran.projetodesweb.domain.Cliente;
import com.iran.projetodesweb.domain.Pedido;

@Service
public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	void sendNewPasswordEmail(Cliente cliente, String newPass);
	
	void sendHtmlEmail(MimeMessage msg);
	

	

	
	
}
