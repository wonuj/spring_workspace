package kr.co.jhta.di.service.step7;

import java.util.List;

import kr.co.jhta.di.vo.User;

public interface UserService {
	// 기능을 정의 한다.
	// event를 보내기 위해 모든 유저정보를 가져온다.
	List<User> getAllUser();
}
