package kr.or.ddit.reply.dao;

import java.util.List;

import kr.or.ddit.mybatis.MyBatisUtil;
import kr.or.ddit.reply.model.ReplyVO;

import org.apache.ibatis.session.SqlSession;

public class ReplyDaoImpl implements IReplyDao {

	/**
	 * Method : replyMaxCnt
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 해당 게시글의 댓글 전체 수
	 */
	@Override
	public int replyMaxCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int replyMaxCnt = sqlSession.selectOne("reply.replyMaxCnt");
		sqlSession.close();
		
		return replyMaxCnt;
	}
	
	

	/**
	 * Method : insertReply
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param replyVo
	 * @return
	 * Method 설명 : 댓글 등록
	 */
	@Override
	public int insertReply(ReplyVO replyVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int insertReply = sqlSession.insert("reply.insertReply", replyVo);
		sqlSession.commit();
		sqlSession.close();
		
		return insertReply;
	}



	/**
	 * Method : replyList
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 해당 게시글 댓글 리스트 조회
	 */
	@Override
	public List<ReplyVO> replyList(int postId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<ReplyVO> replyList = sqlSession.selectList("reply.replyList", postId);
		sqlSession.close();
		
		return replyList;
	}



	/**
	 * Method : delReplyCnt
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 댓글이 있는 게시글 삭제 시 댓글도 삭제 처리(사용여부 변경)
	 */
	@Override
	public int delReplyCnt(int postId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int delReplyCnt = sqlSession.update("reply.delReplyCnt", postId);
		sqlSession.commit();
		sqlSession.close();

		return delReplyCnt;
	}



	@Override
	public int deleteReply(int replyId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int deleteReply = sqlSession.update("reply.deleteReply", replyId);
		sqlSession.commit();
		sqlSession.close();
		
		return deleteReply;
	}



	/**
	 * Method : getReply
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param replyId
	 * @return
	 * Method 설명 : 댓글 하나의 정보
	 */
	@Override
	public ReplyVO getReply(int replyId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		ReplyVO replyVo = sqlSession.selectOne("reply.getReply", replyId);
		sqlSession.close();
		
		return replyVo;
	}



	@Override
	public int replyCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int replyCnt = sqlSession.selectOne("reply.replyCnt");
		sqlSession.close();
		
		return replyCnt;
	}

}
