package kr.or.ddit.board.service;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.board.model.BoardVO;

import org.junit.Before;
import org.junit.Test;

public class BoardServiceTest {
	private IBoardService boardService;
	
	@Before
	public void setup() {
		boardService = new BoardServiceImpl();
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
		List<BoardVO> boardList = boardService.boardList();
		
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
		int boardCnt = boardService.boardCnt();
		
		/***Then***/
		assertEquals(2, boardCnt);

	}
	
	
	/**
	* Method : addBoardTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 새로운 게시판 추가 테스트
	*/
	@Test
	public void addBoardTest() {
		/***Given***/
		BoardVO boardVo = new BoardVO(3, "admin", "Q&A", "y");

		/***When***/
		int addCnt = boardService.addBoard(boardVo);
		
		/***Then***/
		assertEquals(1, addCnt);
	}
	
	
	/**
	* Method : modifyBoardTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 게시판 사용여부 변경 테스트
	*/
	@Test
	public void modifyBoardTest() {
		/***Given***/
		BoardVO boardVo = new BoardVO(3, "admin", "Q&A", "n");

		/***When***/
		int updateCnt = boardService.modifyBoard(boardVo);
		
		/***Then***/
		assertEquals(1, updateCnt);
	}
	
	
	/**
	* Method : getboardTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 입력받은 게시판 아이디와 일치하는 게시판의 정보 확인 테스트
	*/
	@Test
	public void getboardTest(){
		/***Given***/
		int boardId = 2;

		/***When***/
		BoardVO boardVo = boardService.getBoard(boardId);

		/***Then***/
		assertEquals("자유게시판", boardVo.getBoardName());
	}
}
