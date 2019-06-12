package kr.or.ddit.attachFile.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.attachFile.model.AttachFileVO;
import kr.or.ddit.mybatis.MyBatisUtil;

public class AttachFileDaoImpl implements IAttachFileDao {

	@Override
	public int insertFile(SqlSession sqlSession, AttachFileVO fileVo) {
		return sqlSession.insert("file.insertFile", fileVo);
	}

	/**
	 * Method : getFileList
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 해당 게시글에 첨부된 파일리스트 조회
	 */
	@Override
	public List<AttachFileVO> getFileList(int postId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		List<AttachFileVO> fileList = sqlSession.selectList("file.getFileList", postId);
		sqlSession.close();
		
		return fileList;
	}

	@Override
	public AttachFileVO getFile(String fileId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		AttachFileVO fileVo = sqlSession.selectOne("file.getFile", fileId);
		return fileVo;
	}

	/**
	 * Method : deleteFile
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 게시글 수정 시 해당 게시글에 첨부된 파일 삭제
	 */
	@Override
	public int deleteFile(int postId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		int deleteCnt = sqlSession.delete("file.deleteFile", postId);
		sqlSession.commit();
		sqlSession.close();
		
		return deleteCnt;
	}

	@Override
	public int delUpdateFiles(SqlSession sqlSession, String delFileId) {
		return sqlSession.delete("file.delUpdateFiles", delFileId);
	}


}
