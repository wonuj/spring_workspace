package kr.co.jhta.di.step2;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.KakaotalkMessageSender;

public class Main {

	public static void main(String[] args) {
		String conf = "classpath:/spring/context-step2.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		AlramServiceImpl as = ctx.getBean(AlramServiceImpl.class);
		as.alram("비상입니다.");
		
		KakaotalkMessageSender kms = ctx.getBean(KakaotalkMessageSender.class);
		kms.send("SKT", "010-4212-5432", "카카오톡 서버 점검", "내일 진행 예정입니다.");
		
	}
}
