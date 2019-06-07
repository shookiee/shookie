package kr.or.ddit.post.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.Paging.model.PageVO;
import kr.or.ddit.mybatis.MyBatisUtil;
import kr.or.ddit.post.model.PostVO;

public class PostDaoImpl implements IPostDao {


	/**
	* Method : postList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 전체 게시글 리스트 조회
	*/
	@Override
	public List<PostVO> allPostList() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<PostVO> allPostList = sqlSession.selectList("post.allPostList");
		sqlSession.close();
		
		return allPostList;
	}
	
	
	
	/**
	* Method : boardPostList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 특정 게시판 게시글 조회
	*/
	@Override
	public List<PostVO> boardPostList(int boardId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<PostVO> boardPostList = sqlSession.selectList("post.boardPostList", boardId);
		sqlSession.close();
		
		return boardPostList;
	}

	
	/**
	* Method : postCnt
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 특정 게시판 게시글 갯수
	*/
	@Override
	public int postCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int postCnt = (Integer)sqlSession.selectOne("post.postCnt");
		sqlSession.close();
		
		return postCnt;
	}



	/**
	* Method : postList
	* 작성자 : PC23
	* 변경이력 :
	* @param pageVO
	* @return
	* Method 설명 : 게시글 페이징 리스트
	*/
	@Override
	public List<PostVO> postList(PageVO pageVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<PostVO> postList = sqlSession.selectList("post.postList", pageVo);
		sqlSession.close();
		
		return postList;
	}





	


	

	
	


	
	
	
	
	
}
