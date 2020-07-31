package com.will.awssqsprovider.controller;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonSQSListener {

	@SqsListener("${cloud.aws.sqs.queue.url}")
	public void receive(String message, @Header("SenderId") String senderId) {
		System.out.println(String.format("%s %s", message, senderId));
	}

}
