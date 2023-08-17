package com.kh1.springhome.interceptor;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh1.springhome.dao.BoardDao;
import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.error.NoTargetException;

@Component
public class BoardDefenderInterceptor implements HandlerInterceptor {
	@Autowired
	BoardDao boardDao;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//목표 : 세션과 작성자, 글번호를 이용하여 조회수 중복 방지 처리 
		
		
		//글정보 불러오기
		int board_no= Integer.parseInt( request.getParameter("board_no"));
		BoardDto boardDto = boardDao.detail(board_no);
		if(boardDto == null) {
			throw new NoTargetException("존재하지 않는 게시글");
		}
		
		//로그인 사용자 불러오기(없을수 있음)
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("name");
		
		//세션에 있는 history란 이름의 저장소를 이용하여  중복 검사
		Set<Integer> history;
		if (session.getAttribute("history") != null) {
			history = (Set<Integer>) session.getAttribute("history");
		}
		else {
			history = new HashSet<>();
		}
		boolean isRead =history.contains(board_no);
		if(isRead == false) {
			history.add(board_no);
			session.setAttribute("history", history);			
		}
		
		boolean isOwner = boardDto.getBoard_writer() != null 
				&& memberId !=null 
				&& boardDto.getBoard_writer().equals(memberId);
		
		
//		if(내글도 아니고 읽은적도 없으면) {
		if(isOwner ==false&& isRead ==false) {
			boardDao.updateDetail(board_no);
		}
		return true;
	}
}
