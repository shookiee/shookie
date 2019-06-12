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




	/**
	 * Method : postPagingList
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param map
	 * @return
	 * Method 설명 : 게시글 페이징 리스트
	 */
	@Override
	public Map<String, Object> postPagingList(Map<String, Object> map) {
		List<PostVO> postPagingList = postDao.postPagingList(map);
		
		int postCnt = postDao.postCnt((int) map.get("boardId"));
		int pageSize = (int) map.get("pageSize");
		int pagination = (int) Math.ceil((double)postCnt/pageSize);
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("postPagingList", postPagingList);
		resultMap.put("pagination", pagination);
		
		return resultMap;
	}




	@Override
	public int insertPost(PostVO postVo) {
		return postDao.insertPost(postVo);
	}




	@Override
	public int postMaxCnt() {
		return postDao.postMaxCnt();
	}




	@Override
	public PostVO getPost(int postId) {
		return postDao.getPost(postId);
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
		return postDao.updatePost(postVo);
	}




	/**
	 * Method : answerPoㄲst
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postVo
	 * @return
	 * Method 설명 : 답글 등록
	 */
	@Override
	public int answerPost(PostVO postVo) {
		return postDao.answerPost(postVo);
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
		return postDao.deletePost(postId);
	}




	/**
	* Method : postCnt
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시글 전체 수 조회
	*/
	@Override
	public int AllPostCnt() {
		return postDao.AllPostCnt();
	}







}
