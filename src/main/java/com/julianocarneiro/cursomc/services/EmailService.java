package com.julianocarneiro.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.julianocarneiro.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
