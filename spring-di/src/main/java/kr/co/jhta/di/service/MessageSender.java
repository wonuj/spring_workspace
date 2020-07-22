package kr.co.jhta.di.service;

public interface MessageSender {
	// MessageSender interface --> 메세지를 발송하는 것
	// 카톡으로도 메세지로도 다양한 방법으로 메세지를 발송할 수 있음.
	// 4개의 값을 받았으면 좋겠다. 누가 보냈는지, 누구에게, 제목은, 내용은?
	void send(String from, String to, String subject, String content);
}
