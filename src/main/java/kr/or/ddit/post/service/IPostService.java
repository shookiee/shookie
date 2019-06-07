package kr.or.ddit.post.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.Paging.model.PageVO;
import kr.or.ddit.post.model.PostVO;

public interface IPostService {

	/**
	* Method : allPostList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 전체 게시판 게시글 조회 리스트
	*/
	List<PostVO> allPostList();
	
	
	/**
	* Method : boardPostList
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 특정 게시판 게시글 조회
	*/
	List<PostVO> boardPostList(int boardId);

}
