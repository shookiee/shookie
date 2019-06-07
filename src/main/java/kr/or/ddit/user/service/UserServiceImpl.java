package kr.or.ddit.user.service;

import kr.or.ddit.user.dao.IUserDao;
import kr.or.ddit.user.dao.UserDaoImpl;
import kr.or.ddit.user.model.UserVO;

public class UserServiceImpl implements IUserService {
	IUserService service;
	IUserDao userDao = new UserDaoImpl();
	
	@Override
	public UserVO getUser(String userId) {
		return userDao.getUser(userId);
	}

}
