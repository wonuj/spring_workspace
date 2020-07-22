package kr.co.jhta.di.service;

public class SmsMessageSender implements MessageSender {
	// SmsMessageSender는 MessageSender를 구현한 것.
	
	// 계약한 통신사의 이름을 전달받고 싶다. 값을 전달 받는다. (필드, setter 메소드) 
	// 통신사 (필드)
	private String company;
	// 통신사 주입받기 (setter 메소드)
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public void send(String from, String to, String subject, String content) {
		System.out.println(company + "통신사를 이용합니다.");
		System.out.println("SMS 발신자: " + from);
		System.out.println("SMS 수신자: " + to);
		System.out.println("SMS 제목: " + subject);
		System.out.println("SMS 내용: " + content);
		System.out.println("--------------------------");
	}
	
}
