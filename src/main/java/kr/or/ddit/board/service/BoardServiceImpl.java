package kr.or.ddit.board.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.board.dao.BoardDaoImpl;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.model.BoardVO;

public class BoardServiceImpl implements IBoardService {

	private IBoardService service;

	private IBoardDao boardDao = new BoardDaoImpl();

	/**
	* Method : boardList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 리스트 조회
	*/
	@Override
	public List<BoardVO> boardList() {
		return boardDao.boardList();
	}

	
	/**
	* Method : boardCntTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 전체 수 조회
	*/
	@Override
	public int boardCnt() {
		return boardDao.boardCnt();
	}
	
	
	/**
	* Method : addBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 새로운 게시판 추가
	*/
	@Override
	public int addBoard(BoardVO boardVo) {
		return boardDao.addBoard(boardVo);
	}


	/**
	* Method : modifyBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 게시판 사용 여부 변경
	*/
	@Override
	public int modifyBoard(BoardVO boardVo) {
		return boardDao.modifyBoard(boardVo);
	}



}
