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


	/**
	 * Method : getBoard
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param boardId
	 * @return
	 * Method 설명 : 입력받은 게시판 아이디와 일치하는 게시판의 정보
	 */
	@Override
	public BoardVO getBoard(int boardId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		BoardVO boardVo = sqlSession.selectOne("board.getBoard", boardId);
		sqlSession.close();
		
		return boardVo;
	}




	
	
}
