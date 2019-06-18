package kr.or.ddit.post.dao;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.Paging.model.PageVO;
import kr.or.ddit.post.dao.IPostDao;
import kr.or.ddit.post.dao.PostDaoImpl;
import kr.or.ddit.post.model.PostVO;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostDaoTest {
	
	private static final Logger logger = LoggerFactory
			.getLogger(PostDaoTest.class);
	
	private IPostDao postDao;
	
	@Before
	public void setup() {
		postDao = new PostDaoImpl();
	}
	
	
	/**
	* Method : postList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 전체 게시글 리스트 조회 테스트
	*/
	@Test
	public void allPostListTest() {
		/***Given***/

		/***When***/
		List<PostVO> allPostList = postDao.allPostList();
		
		/***Then***/
		assertEquals(4, allPostList.size());
		assertEquals("admin", allPostList.get(0).getUserId());
	}
	
	
	
	/**
	* Method : boardPostListTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 특정 게시판 게시글 조회 테스트
	*/
	@Test
	public void boardPostListTest() {
		/***Given***/
		int boardId = 2;

		/***When***/
		List<PostVO> boardPostList = postDao.boardPostList(boardId);
		
		/***Then***/
		assertEquals(2, boardPostList.size());
		assertEquals("free test", boardPostList.get(0).getPostTitle());
		
	}
	 

	/**
	* Method : postCntTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 특정 게시판 게시글 갯수 확인 테스트
	*/
	@Test
	public void postCntTest() {
		/***Given***/
		int boardId = 1;

		/***When***/
		int cnt = postDao.postCnt(boardId);

		/***Then***/
		assertEquals(3, cnt);
	}
	

	

}
