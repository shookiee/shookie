package kr.or.ddit.post.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.Paging.model.PageVO;
import kr.or.ddit.post.dao.IPostDao;
import kr.or.ddit.post.dao.PostDaoImpl;
import kr.or.ddit.post.model.PostVO;

public class PostServiceImpl implements IPostService {
	
	private IPostService service;
	
	private IPostDao postDao = new PostDaoImpl();
	
	/**
	* Method : allPostList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 전체 게시판 게시글 조회 리스트
	*/
	@Override
	public List<PostVO> allPostList() {
		return postDao.allPostList();
	}

	
	
	
	/**
	* Method : boardPostList
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 특정 게시판 게시글 조회 리스트
	*/
	@Override
	public List<PostVO> boardPostList(int boardId) {
		return postDao.boardPostList(boardId);
	}




}
