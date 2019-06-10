package kr.or.ddit.attachFile.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.attachFile.model.AttachFileVO;

public interface IAttachFileDao {
	int insertFile(SqlSession sqlSession, AttachFileVO fileVo);

	/**
	 * Method : getFileList
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 해당 게시글에 첨부된 파일리스트 조회
	 */
	List<AttachFileVO> getFileList(int postId);

	/**
	 * Method : getFile
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param fileId
	 * @return
	 * Method 설명 : 해당 게시글에 첨부된 파일 조회
	 */
	AttachFileVO getFile(String fileId);

	
	
	/**
	 * Method : deleteFile
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 게시글 수정 시 해당 게시글에 첨부된 파일 삭제
	 */
	int deleteFile(int postId);
	
}
