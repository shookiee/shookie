package kr.or.ddit.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.board.model.BoardVO;
import kr.or.ddit.mybatis.MyBatisUtil;

public class BoardDaoImpl implements IBoardDao {

	/**
	* Method : boardList
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 리스트 조회
	*/
	@Override
	public List<BoardVO> boardList() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<BoardVO> boardList = sqlSession.selectList("board.boardList");
		sqlSession.close();

		return boardList;
	}

	
	/**
	* Method : boardCnt
	* 작성자 : PC23
	* 변경이력 :
	* @return
	* Method 설명 : 게시판 전체 수 조회
	*/
	@Override
	public int boardCnt() {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int boardCnt = (Integer)sqlSession.selectOne("board.boardCnt");
		sqlSession.close();
		
		return boardCnt;
	}

	
	
	/**
	* Method : addBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardVo
	* @return
	* Method 설명 : 새로운 게시판 추가
	*/
	@Override
	public int addBoard(BoardVO boardVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int addBoard = sqlSession.insert("board.addBoard", boardVo);
		sqlSession.commit();
		sqlSession.close();
		
		return addBoard;
	}

	

	/**
	* Method : modifyBoard
	* 작성자 : PC23
	* 변경이력 :
	* @param boardId
	* @return
	* Method 설명 : 게시판 사용여부 변경
	*/
	@Override
	public int modifyBoard(BoardVO boardVo) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int updateCnt = sqlSession.update("board.modifyBoard", boardVo);
		sqlSession.commit();
		sqlSession.close();
		
		return updateCnt;
	}




	
	
}
