package kr.or.ddit.user.service;

import static org.junit.Assert.*;
import kr.or.ddit.user.model.UserVO;

import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
	IUserService userService;
	
	@Before
	public void setup(){
		userService = new UserServiceImpl();
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
		UserVO userVo = userService.getUser(userId);

		/***Then***/
		assertEquals("라이언", userVo.getName());
	}

}
