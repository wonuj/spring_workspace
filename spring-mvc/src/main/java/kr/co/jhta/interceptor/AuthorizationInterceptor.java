package kr.co.jhta.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


// 인증된 사용자가 해당 페이지에 대한 접근권한을 가지고 있는지 체크한다.
public class AuthorizationInterceptor extends HandlerInterceptorAdapter{
	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		List<String> reqRoles = (List<String>) request.getAttribute("roles");
//		if(reqRoles.isEmpty()) {
//			return true;
//		}
//		
//		HttpSession session = request.getSession();
//		User user = (User) session.getAttribute("LOGIN_USER");
//		if(user == null) {
//			response.sendRedirect("/signin.do?error=deny");
//			return false;
//		}
//		
//		List<String> hasRoles = user.getRoles();
//		if(!canAccess(reqRoles, hasRoles)) {
//			response.sendRedirect("/signin.do?error=role");
//			return false;
//		}
//		
//		return true;
//	}
	
	// 리팩토링  
	
	@SuppressWarnings("unchecked") 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 인증과정 통과여부를 조회한다.
		// 통과여부가 skip인 경우는 접근권한 체크를 실행하지 않음
		String auth = (String) request.getAttribute("auth");
		
		// 인증과정 통과여부가 skip인 경우
		//		- 접근권한이 필요없는 요청임 (모든 사용자에게 열려있는 페이지)
		// 		- 로그인 여부, 접근권한 소유여부를 체크할 필여가 없음
		
		// 인증과정 통과여부가 pass인 경우
		//		- 접근권한이 필요한 요청임
		// 		- 로그인된 사용자임
		// 		- 로그인된 사용자가 필요한 접근권한을 가지고 있는지 체크해야 함
		if ("pass".equals(auth)) {
			List<String> reqRoles = (List<String>) request.getAttribute("reqRoles");
			List<String> hasRoles = (List<String>) request.getAttribute("hasRoles");
			
			if (!canAccess(reqRoles, hasRoles)) {
				response.sendRedirect("/signin.do?error=role");
				return false;
			}
		}
		
		return true;
	}
	
	private boolean canAccess(List<String> reqRoles, List<String> hasRoles) {
		for (String role : hasRoles) {
			if(reqRoles.contains(role)) {
				return true;
			}
		}
		return false;
	}
}