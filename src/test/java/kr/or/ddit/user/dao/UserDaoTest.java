package kr.or.ddit.user.dao;

import static org.junit.Assert.*;
import kr.or.ddit.user.model.UserVO;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoTest {

	private IUserDao userDao;
	
	private static final Logger logger = LoggerFactory
			.getLogger(UserDaoTest.class);
	
	@Before
	public void setup(){
		userDao = new UserDaoImpl();
	}
	
	
	/**
	* Method : getUserTest
	* 작성자 : PC23
	* 변경이력 :
	* Method 설명 : 특정 사용자 조회 테스트
	*/
	@Test
	public void getUserTest() {
		/***Given***/
		String userId = "ryan";

		/***When***/
		UserVO userVo = userDao.getUser(userId);
		
		/***Then***/
		assertEquals("라이언", userVo.getName());
	}

}
