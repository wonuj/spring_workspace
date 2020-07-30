package kr.co.jhta.dao;

import java.util.List;

import kr.co.jhta.vo.Board;

public interface BoardDao {

	void insertBoard(Board board);
	List<Board> selectBoards();
	Board selctBoard(long boardNo);
	void updateBoard(Board board);
	void deleteBoard(long boardNo);
}
