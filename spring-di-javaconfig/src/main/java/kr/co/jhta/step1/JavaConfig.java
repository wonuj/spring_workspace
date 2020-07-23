package kr.co.jhta.step1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.jhta.sender.KakaotalkMessageSender;
import kr.co.jhta.sender.MessageSender;
import kr.co.jhta.service.EventService;
import kr.co.jhta.service.EventServiceImpl;

/*
 *  bean설정 자바클래스
 *  아래의 spring bean configuration 파일의 설정과 동일 설정으로 자바코드로 정의한 것이다.
 */
@Configuration	// 빈을 등록해놓으면 Spring빈으로 알아서 등록해줌
public class JavaConfig {
	// <bean id="kakao" class="kr.co.jhta.sender.KakaotalkMessageSender" />
	@Bean
	public KakaotalkMessageSender kakao() {
		return new KakaotalkMessageSender();
	}
	
	/*
	 * <bean id="eventService" class="kr.co.jhta.service.EventServiceImpl">
	 * 		<property name="messageSender" ref="messageSender" />
	 * </bean>
	 */
	@Bean
	public EventService eventService(MessageSender messageSender) {
		EventServiceImpl eventServiceImpl = new EventServiceImpl();
		eventServiceImpl.setMessageSender(messageSender);
		return eventServiceImpl;
	}
}
