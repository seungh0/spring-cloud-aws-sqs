package com.will.awssqsprovider;

import com.amazonaws.services.sqs.model.SendMessageResult;
import com.will.awssqsprovider.component.AmazonSQSApiCaller;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AppRunner implements CommandLineRunner {

	private final AmazonSQSApiCaller amazonSQSApiCaller;

	@Override
	public void run(String... args) throws Exception {
		SendMessageResult result = amazonSQSApiCaller.sendMessage("Hello AWS SQS");
		System.out.println(result);
	}

}
