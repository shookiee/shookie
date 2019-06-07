package kr.or.ddit.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.board.model.BoardVO;
import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	
	private IUserService userService;
	private IBoardService boardService;
	
	@Override
	public void init() throws ServletException {
		userService = new UserServiceImpl();
		boardService = new BoardServiceImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("40 LoginController doGet()");
		request.getRequestDispatcher("/login/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("45 LoginController doPost()");
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		
		UserVO userVo = userService.getUser(userId);
		List<BoardVO> boardList = boardService.boardList();
		
		if(userVo != null && userVo.getUserId().equals(userId) && userVo.getPass().equals(pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("USER_INFO", userVo);
			session.setAttribute("boardList", boardList);
			
			
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
		}
	}

}
