package com.will.awssqsprovider.component;

import com.amazonaws.services.sqs.model.SendMessageResult;

public interface AmazonSQSApiCaller {

	SendMessageResult sendMessage(String message);

}
