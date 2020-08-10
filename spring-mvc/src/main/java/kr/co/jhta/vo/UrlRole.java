package kr.co.jhta.vo;

import java.util.Set;

// 특정 url에 대한 접근 권한들을 담는 개체 
public class UrlRole {
	
	private String path;
	private Set<String> roles;
	
	public UrlRole() {
		// TODO Auto-generated constructor stub
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
}