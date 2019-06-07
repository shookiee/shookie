package kr.or.ddit.post.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.Paging.model.PageVO;
import kr.or.ddit.post.model.PostVO;

public interface IPostDao {
	
	/**
	* Method : postList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 전체 게시글 리스트 조회
	*/
	List<PostVO> allPostList();
	

	/**
	* Method : boardPostList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 특정 게시판 게시글 리스트 조회
	*/
	List<PostVO> boardPostList(int boardId);
	
	/**
	* Method : postCnt
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 게시글 갯수
	*/
	int postCnt();
	
	
	/**
	* Method : postList
	* 작성자 : PC23
	* 변경이력 :
	* @param pageVO
	* @return
	* Method 설명 : 게시글 페이징 리스트
	*/
	List<PostVO> postList(PageVO pageVo);

}
