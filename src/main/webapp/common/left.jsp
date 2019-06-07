<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="col-sm-3 col-md-2 sidebar">
   <ul class="nav nav-sidebar">
   
      
      <li class="active"><a href="${pageContext.request.contextPath }/board">게시판 관리</a></li>
		<c:forEach items="${boardList }" var="board">
		<c:choose>
			<c:when test="${board.use_yn eq 'y'}">
		      	<li class="active"><a href="${pageContext.request.contextPath }/post?boardId=${board.boardId}">${board.boardName }</a></li>
			</c:when>
		</c:choose>
		</c:forEach>
   
   </ul>
</div>