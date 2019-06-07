package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.model.BoardVO;

public interface IBoardService {

	/**
	* Method : boardList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 리스트 조회
	*/
	List<BoardVO> boardList();
	
	
	/**
	* Method : boardCnt
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 전체 수 조회
	*/
	int boardCnt();
	
	
	/**
	* Method : addBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 새로운 게시판 추가
	*/
	int addBoard(BoardVO boardVo);
	
	
	
	/**
	* Method : modifyBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 게시판 사용여부 변경
	*/
	int modifyBoard(BoardVO boardVo);
}
