package kr.co.jhta;

import kr.co.jhta.dao.UserDao;
import kr.co.jhta.vo.User;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		
//		System.out.println("새 사용자 등록하기");
//		User user2 = new User("park","박박이","zxcv1234","park@gamil.com");
//		User user3 = new User("shim","심심이","zxcv1234","shim@gamil.com");
//		User user4 = new User("ryu","류류이","zxcv1234","ryu@gamil.com");
//		User user5 = new User("yang","양양이","zxcv1234","yang@gamil.com");
//		userDao.insertUser(user2);
//		userDao.insertUser(user3);
//		userDao.insertUser(user4);
//		userDao.insertUser(user5);
//		System.out.println("새 사용자 등록이 완료되었습니다.");
		
//		System.out.println("모든 사용자 조회하기");
//		List<User> user1 = userDao.getAllUsers();
//		for(User user : user1) {
//			System.out.println(user.getId()+", "+user.getName());
//		}
//		System.out.println();
//		
//		System.out.println("특정 아이디의 사용자 조회하기");
//		User user2 = userDao.getUserById("lee");
//		//System.out.println(user2.getId()); => 이렇게 사용하면 안됨. null일 경우 nullpointer에러발생. 한개가 조회되는경우 반드시 null체크한 후 사용할 것
//		System.out.println(user2);
//		if(user2 != null) {
//			System.out.println(user2.getId() + ", " + user2.getName() + ", " + user2.getEmail() + ", " + user2.getCreatedDate());
//		} else {
//			System.out.println("[해당 아이디와 일치하는 유저정보가 존재하지 않습니다]");
//		}
//		
//		System.out.println("전체 사용자 수 조회하기");
//		int usersCount = userDao.getUsersCount();
//		System.out.println("전체 회원수 : " + usersCount + "명");
//		System.out.println();
		
//		int userCntBfRm = userDao.getUsersCount();
//		System.out.println("삭제전 회원수 : " + userCntBfRm);
//		userDao.deleteUserById("ryu");
//		int userCntAfRm = userDao.getUsersCount();
//		System.out.println("한명 삭제후 회원수 : " + userCntAfRm);
		
//		User user = userDao.getUserByEmail("shim@gamil.com");
//		if(user != null) {
//			System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail() + ", " + user.getCreatedDate());			
//		} else {
//			System.out.println("[해당 이메일과 일치하는 유저정보가 존재하지 않습니다]");
//		}
		
		System.out.println("사용자 정보 업데이트");
		User user = userDao.getUserById("shim");
		user.setPassword("zxcv4321");
		user.setEmail("shim@sk.co.kr");
		userDao.updateUser(user);
		System.out.println("사용자 업데이트 완료");
	}

}