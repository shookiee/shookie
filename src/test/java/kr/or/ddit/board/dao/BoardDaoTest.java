package kr.or.ddit.board.dao;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import kr.or.ddit.board.model.BoardVO;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoardDaoTest {
	private static final Logger logger = LoggerFactory
			.getLogger(BoardDaoTest.class);
	
	private IBoardDao boardDao;
	
	@Before
	public void setup(){
		boardDao = new BoardDaoImpl();
	}
	
	/**
	* Method : boardListTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 리스트 조회
	*/
	@Test
	public void boardListTest() {
		/***Given***/

		/***When***/
		List<BoardVO> boardList = boardDao.boardList();
		
		/***Then***/
		assertEquals(2, boardList.size());
		assertEquals("공지사항", boardList.get(0).getBoardName());
		
	}
	
	
	
	
	/**
	* Method : boardCntTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 전체 수 조회
	*/
	@Test
	public void boardCntTest() {
		/***Given***/

		/***When***/
		int boardCnt = boardDao.boardCnt();
		
		/***Then***/
		assertEquals(2, boardCnt);

	}
	
	
	/**
	* Method : addBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 새로운 게시판 추가
	*/
	@Test
	public void addBoardTest(){
		/***Given***/
		BoardVO boardVo = new BoardVO(3, "admin", "Q&A", "y");

		/***When***/
		int addCnt = boardDao.addBoard(boardVo);
		
		/***Then***/
		assertEquals(1, addCnt);
	}
	
	
	
	/**
	* Method : modifyBoardTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 사용여부 변경
	*/
	@Test
	public void modifyBoardTest() {
		/***Given***/
		BoardVO boardVo = new BoardVO(1, "admin", "공지사항", "y");

		/***When***/
		int updateCnt = boardDao.modifyBoard(boardVo);
		
		/***Then***/
		assertEquals(1, updateCnt);
	}

}
