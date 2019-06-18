package kr.or.ddit.attachFile.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.attachFile.model.AttachFileVO;

public interface IAttachFileDao {

	/**
	* Method : insertFile
	* 작성자 : PC23
	* 변경이력 :
	* @param uploadFileList
	* @return
	* Method 설명 : 첨부파일 업로드
	*/
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
	* Method : delUpdateFiles
	* 작성자 : PC23
	* 변경이력 :
	* @param delFileIds
	* Method 설명 : 게시글 수정할때 파일이 수정되었으면 기존의 파일데이터 삭제
	*/
	int delUpdateFiles(SqlSession sqlSession, String delFileId);
	
}
