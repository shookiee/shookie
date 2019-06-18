package kr.or.ddit.user.service;

import kr.or.ddit.user.dao.IUserDao;
import kr.or.ddit.user.dao.UserDaoImpl;
import kr.or.ddit.user.model.UserVO;

public class UserServiceImpl implements IUserService {
	IUserService service;
	IUserDao userDao = new UserDaoImpl();
	
	
	/**
	* Method : getUser
	* 작성자 : PC23
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 특정 사용자 조회
	*/
	@Override
	public UserVO getUser(String userId) {
		return userDao.getUser(userId);
	}

}
