package kr.co.jhta.vo;

import java.util.Date;

public class Comment {

	/*
	 *COMMENT_NO
COMMENT_WRITER
COMMENT_CONTENT
BLOG_NO
COMMENT_CREATE_DATE 
	 */
	private int commentNo;
	private String commentWriter;
	private String commentContent;
	private int blogNo;
	private Date commentCreateDate;
	
	public Comment () {}
	
	public Comment (int commentNo, String commentWriter, String commentConent, int blogNo) {
		this.commentNo = commentNo;
		this.commentWriter = commentWriter;
		this.commentContent = commentConent;
		this.blogNo = blogNo;
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public int getBlogNo() {
		return blogNo;
	}

	public void setBlogNo(int blogNo) {
		this.blogNo = blogNo;
	}

	public Date getCommentCreateDate() {
		return commentCreateDate;
	}

	public void setCommentCreateDate(Date commentCreateDate) {
		this.commentCreateDate = commentCreateDate;
	}
		
}
