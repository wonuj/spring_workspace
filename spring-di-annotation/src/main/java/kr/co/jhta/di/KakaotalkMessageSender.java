package kr.co.jhta.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kakao")
public class KakaotalkMessageSender implements MessageSender {
	
	@Value("${message.sender.kakao.username}")
	private String username;
	@Value("${message.sender.kakao.password}")
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct	// 생성된 이후에
	public void connect() {
		System.out.println(username + ", " + password + "로 카카오톡 서버에 연결됨" );
	}
	
	@PreDestroy	// 부서지기 전에
	public void disconnect() {
		
	}
	
	@Override
	public void send(String from, String to, String subject, String content) {
		System.out.println("통신사를 이용합니다.");
		System.out.println("SMS 발신자: " + from);
		System.out.println("SMS 수신자: " + to);
		System.out.println("SMS 제목: " + subject);
		System.out.println("SMS 내용: " + content);
		System.out.println("--------------------------");
	}
}
