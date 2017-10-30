package com.akhildevz.JmzActiveMQ.listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination = "standalone.queue")
	public void consume(String message){
		System.out.println("Recived the message: "+ message);
	}

}
