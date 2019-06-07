package kr.or.ddit.user.service;

import kr.or.ddit.user.model.UserVO;

public interface IUserService {
	UserVO getUser(String userId);
}
