package kr.co.jhta.di.step1;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.SmsMessageSender;

public class Main {
	public static void main(String[] args) {
		String conf = "classpath:/spring/context-step1.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		SmsMessageSender sms = ctx.getBean(SmsMessageSender.class);
		System.out.println(sms);
		sms.send("홍보부", "010-2133-1233", "할인", "전품목 50% 할인");
		
		EventNotificationServiceImpl ens = ctx.getBean(EventNotificationServiceImpl.class);
		
		ens.notice("홍보부", "폐업안내", "ㅇㅇㅇ");
	}
}
