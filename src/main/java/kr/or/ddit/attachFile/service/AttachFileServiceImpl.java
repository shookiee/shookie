package kr.or.ddit.attachFile.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.attachFile.dao.AttachFileDaoImpl;
import kr.or.ddit.attachFile.dao.IAttachFileDao;
import kr.or.ddit.attachFile.model.AttachFileVO;
import kr.or.ddit.mybatis.MyBatisUtil;

public class AttachFileServiceImpl implements IAttachFileService {

	private IAttachFileDao fileDao = new AttachFileDaoImpl();
	
	/**
	* Method : insertFile
	* 작성자 : PC23
	* 변경이력 :
	* @param uploadFileList
	* @return
	* Method 설명 : 첨부파일 업로드
	*/	
	@Override
	public int insertFile(List<AttachFileVO> uploadFileList) {
		
		int insertCntSum = 0;
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		
		for(AttachFileVO fileVo : uploadFileList){
			int insertCnt = fileDao.insertFile(sqlSession, fileVo);
			
			if (insertCnt != 1) {
				sqlSession.rollback();
				break;
			}
			insertCntSum += insertCnt;
		}
		sqlSession.commit();
		return insertCntSum;
	}

	/**
	 * Method : getFileList
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param postId
	 * @return
	 * Method 설명 : 해당 게시글에 첨부된 파일 리스트
	 */
	@Override
	public List<AttachFileVO> getFileList(int postId) {
		return fileDao.getFileList(postId);
	}

	

	/**
	 * Method : getFile
	 * 작성자 : SHOOKIE
	 * 변경이력 :
	 * @param fileId
	 * @return
	 * Method 설명 : 해당 게시글에 첨부된 파일 조회
	 */
	@Override
	public AttachFileVO getFile(String fileId) {
		
		return fileDao.getFile(fileId);
	}


	
	/**
	* Method : delUpdateFiles
	* 작성자 : PC23
	* 변경이력 :
	* @param delFileIds
	* Method 설명 : 게시글 수정할때 파일이 수정되었으면 기존의 파일데이터 삭제
	*/
	@Override
	public void delUpdateFiles(String[] delFileIds) {
		int delCntSum = 0;
		
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		
		for(String delFileId : delFileIds){
			int delCnt = fileDao.delUpdateFiles(sqlSession ,delFileId);
			
			if (delCnt != 1) {
				sqlSession.rollback();
				break;
			}
			delCntSum += delCnt;
			
		}
		sqlSession.commit();
		sqlSession.close();
	}


}
