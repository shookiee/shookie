package kr.or.ddit.post.service;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.post.model.PostVO;

import org.junit.Before;
import org.junit.Test;

public class PostServiceTest {
	IPostService postService;
	
	@Before
	public void setup(){
		postService = new PostServiceImpl();
	}
	
	
	
	/**
	* Method : test
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 전체 게시글 리스트 조회 테스트
	*/
	@Test
	public void allPostListtest() {
		/***Given***/

		/***When***/
		List<PostVO> allPostList = postService.allPostList();
		
		/***Then***/
		assertEquals(4, allPostList.size());
		assertEquals("admin", allPostList.get(0).getUserId());
	}
	
	
	/**
	* Method : boardPostListTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 특정 게시판 게시글 리스트 조회 테스트
	*/
	@Test
	public void boardPostListTest(){
		/***Given***/
		int boardId = 1;

		/***When***/
		List<PostVO> boardPostList = postService.boardPostList(boardId);
		
		/***Then***/
		assertEquals(1, boardPostList.size());
		assertEquals("notice test", boardPostList.get(0).getPostTitle());
	}

}
