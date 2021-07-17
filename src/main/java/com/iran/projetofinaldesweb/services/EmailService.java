package com.iran.projetofinaldesweb.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.iran.projetofinaldesweb.domain.Cliente;
import com.iran.projetofinaldesweb.domain.Pedido;

@Service
public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
