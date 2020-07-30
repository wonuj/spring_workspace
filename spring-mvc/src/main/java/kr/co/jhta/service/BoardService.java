package kr.co.jhta.service;

import java.util.List;

import kr.co.jhta.vo.Board;

public interface BoardService {
	
	// 모든 게시글 조회(삭제상태 게시글은 제외)
	List<Board> getAllBoards();
	// 새로운 게시글 등록
	void addNewBoard(Board board);
	// 게시글 상세정보 조회
	Board getBoardDetail(long boardNo);
	void increaseBoardLikes(long boardNo);
	void modifyBoardDetail(Board board);
	void deleteBoard(long boardNo, String passoword);
}
