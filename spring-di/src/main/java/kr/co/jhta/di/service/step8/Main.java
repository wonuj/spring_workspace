package kr.co.jhta.di.service.step8;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String conf = "kr/co/jhta/di/service/step8/context-step8-map.xml";
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
//		NoticeService noticeService = ctx.getBean("noticeServiceUsingSet", NoticeService.class);
//		noticeService.notice("경리팀", "급여삭감 안내", "임원급 이상 직원의 급여를 20% 삭감합니다.");
		
		NoticeServiceUsingMap noticeService = ctx.getBean("noticeServiceUsingMap", NoticeServiceUsingMap.class);
		noticeService.notice("사장", "급여인상 안내", "전직원 급여 10% 인상합니다.");
		
//		ctx.destroy();
	}
}