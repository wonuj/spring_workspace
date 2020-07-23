package kr.co.jhta.di.step1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.di.SmsMessageSender;

@Service
public class EventNotificationServiceImpl implements NotificationService {
	// 공지사항을 보내기 위해 MessageSender류가 필요
	// SmsMessageSender류를 자동으로 찾아줌, 동일한 타입을 갖고 있는 객체를 주입
	private SmsMessageSender sms;
	@Autowired
	public void setSms(SmsMessageSender sms) {
		this.sms = sms;
	}
	
	public void notice(String dept, String subject, String content) {
		sms.send(dept, "모든 고객", subject, content);
	}
}
