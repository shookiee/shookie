package kr.or.ddit.attachFile.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.attachFile.dao.AttachFileDaoImpl;
import kr.or.ddit.attachFile.dao.IAttachFileDao;
import kr.or.ddit.attachFile.model.AttachFileVO;
import kr.or.ddit.mybatis.MyBatisUtil;

public class AttachFileServiceImpl implements IAttachFileService {

	private IAttachFileDao fileDao = new AttachFileDaoImpl();
	
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

	@Override
	public AttachFileVO getFile(String fileId) {
		
		return fileDao.getFile(fileId);
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
		return fileDao.deleteFile(postId);
	}


}
