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
	public int postCnt(int boardId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int postCnt = (Integer)sqlSession.selectOne("post.postCnt", boardId);
		sqlSession.close();
		
		return postCnt;
	}




	/**
	 * Method : postPagingList
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param map
	 * @return
	 * Method 설명 : 게시글 페이징 리스트
	 */
	@Override
	public List<PostVO> postPagingList(Map<String, Object> map) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<PostVO> postPagingList = sqlSession.selectList("post.postPagingList", map);
		sqlSession.close();
		
		return postPagingList;
	}



	/**
	 * Method : insertPost
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postVo
	 * @return
	 * Method 설명 : 게시글 추가
	 */
	@Override
	public int insertPost(PostVO postVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int insertCnt =sqlSession.insert("post.insertPost", postVo);
		sqlSession.commit();
		sqlSession.close();
		
		return insertCnt;
	}



	@Override
	public int postMaxCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int postMaxCnt = sqlSession.selectOne("post.postMaxCnt");
		sqlSession.close();
		return postMaxCnt;
	}



	@Override
	public PostVO getPost(int postId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		PostVO postVo = sqlSession.selectOne("post.getPost", postId);
		sqlSession.close();
		return postVo;
	}



	/**
	 * Method : updatePost
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postVo
	 * @return
	 * Method 설명 : 게시글 수정
	 */
	@Override
	public int updatePost(PostVO postVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int updateCnt = sqlSession.update("post.updatePost", postVo);
		sqlSession.commit();
		sqlSession.close();
	
		return updateCnt;
	}



	/**
	 * Method : answerPost
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postVo
	 * @return
	 * Method 설명 : 답글 등록
	 */
	@Override
	public int answerPost(PostVO postVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int answerPost = sqlSession.insert("post.answerPost", postVo);
		sqlSession.commit();
		sqlSession.close();
		
		return answerPost;
	}



	/**
	 * Method : deletePost
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 게시글 삭제(사용여부 미사용으로 변경)
	 */
	@Override
	public int deletePost(int postId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int deleteCnt = sqlSession.update("post.deletePost", postId);
		sqlSession.commit();
		sqlSession.close();
		
		return deleteCnt;
	}





	


	

	
	


	
	
	
	
	
}
