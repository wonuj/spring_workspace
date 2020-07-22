package kr.co.jhta.di.service.step6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public Main() {
		
		String conf = "kr/co/jhta/di/service/step6/context-step6.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		Reporter reporter = ctx.getBean("reporter", Reporter.class);
		
		reporter.report("스프링 컨테이너 활용", "스프링 컨테이너는 객체 생성/조립/보관/유지/관리를 담당하는 객체다.");
		
	}
	
}
