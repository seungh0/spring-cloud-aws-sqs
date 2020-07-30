# Spring Cloud AWS와 AWS SQS를 이용한 메시지 큐

### AWS SQS에 메시지 보내기 (Provider)
* [Amazon Simple Queue Service]
* [Spring Cloud AWS]
### 준비사항
* AWS 회원가입 및 SQS Queue 생성 + IAM 설정

### 개발환경
* Windows 10
* JDK 1.8
* Intellij IDEA 2019.1
* Spring boot 2.3.2
* Gradle 6.4.1


<pre>
<code>
@RequiredArgsConstructor
@Component
public class AmazonSQSApiCallerImpl implements AmazonSQSApiCaller {

	private final AmazonSQSComponent amazonSQSComponent;

	private final AmazonSQS amazonSQS;

	public SendMessageResult sendMessage(String message) {
		return amazonSQS.sendMessage(amazonSQSComponent.getUrl(), message);
	}

}
</code>
</pre>

* [개인 블로그]



[Amazon Simple Queue Service]: https://aws.amazon.com/ko/sqs/
[Spring Cloud AWS]: https://cloud.spring.io/spring-cloud-aws/spring-cloud-aws.html
[개인 블로그]: https://willseungh0.tistory.com/3
