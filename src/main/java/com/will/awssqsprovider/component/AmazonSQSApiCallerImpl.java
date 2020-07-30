package com.will.awssqsprovider.component;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.will.awssqsprovider.component.dto.component.AmazonSQSComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Reference:
 * https://cloud.spring.io/spring-cloud-aws/spring-cloud-aws.html
 * 2.2.3 Spring Boot auto-configuration
 */

@RequiredArgsConstructor
@Component
public class AmazonSQSApiCallerImpl implements AmazonSQSApiCaller {

	private final AmazonSQSComponent amazonSQSComponent;

	private final AmazonSQS amazonSQS;

	public SendMessageResult sendMessage(String message) {
		return amazonSQS.sendMessage(amazonSQSComponent.getUrl(), message);
	}

}
