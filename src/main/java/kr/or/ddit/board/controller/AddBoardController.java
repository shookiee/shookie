package kr.or.ddit.board.controller;

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/addBoard")
public class AddBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(AddBoardController.class);
	
	private IBoardService boardService;
	
	@Override
	public void init() throws ServletException {
		boardService = new BoardServiceImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		logger.debug("36 AddBoardController doPost()");
		
		int boardCnt = boardService.boardCnt();
		int boardId = boardCnt == 0 ? 1 : boardCnt+1;
		
		HttpSession session = request.getSession();
		UserVO userVo = (UserVO) session.getAttribute("USER_INFO");
		String userId = userVo.getUserId();
	
		
		String boardName = request.getParameter("boardName");
		
		String use_yn = request.getParameter("use_yn");
		
		logger.debug("boardId : {}", boardId);
		logger.debug("userId : {}", userId);
		logger.debug("boardName : {}", boardName);
		logger.debug("use_yn : {}", use_yn);
		
		
		BoardVO boardVo = new BoardVO(boardId, userId, boardName, use_yn);
		
		int addCnt = boardService.addBoard(boardVo);
		
		List<BoardVO> boardList = boardService.boardList();
		
		if(addCnt == 1) {
			session.setAttribute("boardList", boardList);
			response.sendRedirect(request.getContextPath() + "/main.jsp");
		} else {
			request.getRequestDispatcher("/board/board.jsp").forward(request, response);
		}
	}

}
