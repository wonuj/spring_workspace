package kr.co.jhta.dao;

import java.util.List;

import kr.co.jhta.vo.Blog;

public interface BlogDao {

	void insertBlog(Blog blog); 
	
	List<Blog> getBlogs();
	List<Blog> getBlogsByWriter(String writer);
	Blog getBlogByNo(int blogNo);
	
    void updateBlog(Blog blog);
    
    void deleteBlog(Blog blog);
    void deleteBlogByNo(int blogNo);
    void deleteBlogByWriter(String writer);
}
