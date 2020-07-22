package kr.co.jhta.di.service.step7;

import java.util.List;

import kr.co.jhta.di.service.MessageSender;
import kr.co.jhta.di.vo.User;

public class EventNotificationServiceImpl implements EventNotificationService {
	// userService와 messageSender라는 것들 구현한 객체가 필요하다.
	// 보내기 기능이 있기만 하면된다. 유저도 마찬가지
	private UserService userService;
	private MessageSender messageSender;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}
	
	@Override
	public void noticeEvent(String dept, String eventName, String eventContent) {
		List<User> users = userService.getAllUser();
		for (User user : users) {
			messageSender.send(dept, user.getTel(), eventName, eventContent);
		}
	}
}
