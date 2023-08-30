package com.kh1.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh1.springhome.dao.BoardDao;
import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.error.AuthorityException;

//게시글 소유자인 경우에만 통과시키는 인터셉터
//- 필요한정보 : 게시글 번호(파라미터), 사용자ID(session 세션)
@Component
public class BoardOwnerInterceptor implements HandlerInterceptor {
	@Autowired
	private BoardDao boardDao;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//현재 사용자의 아이디를 읽는 코드
		HttpSession session = request.getSession();
		String memberId =(String) session.getAttribute("name");
		
		//글번호를 읽는 코드
		//request.getParameter("이름")으로 파라미터를 읽는다.
		// 통신이기 떄문에 반환형이 String이다.
		// 반환명령을 이용하여 원하는 형태로 바꿔 사용할수 있다.
		int board_no =Integer.parseInt(request.getParameter("board_no"));
		BoardDto boardDto = boardDao.detail(board_no);
		if(boardDto.getBoard_writer().equals(memberId)) { //소유자라면
			return true;
		}
		
		else {
			//return false;
		throw new AuthorityException("글소유자가 아닙니다.");
		}
	}
}
