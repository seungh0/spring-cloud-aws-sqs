package com.will.awssqsprovider.controller;

import com.amazonaws.services.sqs.model.SendMessageResult;
import com.will.awssqsprovider.component.AmazonSQSApiCaller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MessageController {

	private final AmazonSQSApiCaller amazonSQSApiCaller;

	@PostMapping("/send")
	public SendMessageResult send(@RequestBody String message) {
		return amazonSQSApiCaller.sendMessage(message);
	}

}
