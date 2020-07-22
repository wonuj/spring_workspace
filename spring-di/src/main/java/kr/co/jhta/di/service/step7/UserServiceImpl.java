package kr.co.jhta.di.service.step7;

import java.util.ArrayList;
import java.util.List;

import kr.co.jhta.di.vo.User;

public class UserServiceImpl implements UserService {
	@Override
	public List<User> getAllUser() {
		List<User> users = new ArrayList<>();
		
		users.add(new User("hong", "홍길동", "010-5234-1232", "sms"));
		users.add(new User("kim", "김유신", "010-3233-2311", "katalk"));
		users.add(new User("kang", "강찬", "010-2236-6736", "sms"));
		users.add(new User("ryu", "류신", "010-7232-5735", "sms"));
		users.add(new User("jang", "신", "010-8233-7632", "katalk"));
		
		return users;
	}
	
}
