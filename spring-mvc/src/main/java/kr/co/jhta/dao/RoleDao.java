package kr.co.jhta.dao;

import java.util.List;

public interface RoleDao {
	
	List<String> getRoleUserById(String userId);
	List<String> getRolesByUrl(String url);
	
}