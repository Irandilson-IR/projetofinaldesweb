package com.iran.projetodesweb.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;


import com.iran.projetodesweb.domain.Pedido;

@Service
public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	
}
