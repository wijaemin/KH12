package com.kh1.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 컨트롤러를 간섭하여 예외의 상황을 다르게 처리하도록 하는 객체
 등록시 @controllerAdvice라고 등록
 @restController를 간섭할 경우에는 @restControllerAdvice를 사용
 적용대상을 옵션으로 지정
 */
//@ControllerAdvice(basePackages = {"com.kh1.springhome.controller"}) //절대표현

@Slf4j
@ControllerAdvice(annotations = {Controller.class}) //어노테이션을 이용한 상대표현
public class ExpceptionControllerAdvice {
/**
 예외는 @ExceptionHandler 메소드로 처리 가능
 - 처리할 예외의 종류 지정 가능
 - 메소드의 형태는 컨트롤러와 같음
 - Try구문의  Catch 블록과 같은 역할을 수행
 - 이메소드에서는 컨트롤러처럼 매개변수를 선언하면 사용할수 있다.
 			- Model, httpSession등 기본적인 컨트롤러 도구 사용 가능
			- catch처럼 예외 처리 객체를 선언할수 있다.
 */
	
	@ExceptionHandler(Exception.class)
	public String error(Exception e) {
//		e.printStackTrace();//이걸 넣으면 로그 찍을수 있다.
		//에러로그에서는 예외객체 한개를 첨부할수 있다.(자동 print stack trace)
		log.error("오류",e); 
		return "/WEB-INF/views/error/500.jsp";
	}
	/**
	내가 지정한 예외들을 처리하도록 추가 핸들러(처리기) 생성
	 */
	@ExceptionHandler(NoTargetException.class)
	public String noTarget(NoTargetException e) {
		//e.printStackTrace();
		return "/WEB-INF/views/error/noTarget.jsp";
	}
	
	@ExceptionHandler(AuthorityException.class)
	public String authority(AuthorityException e) {
		e.printStackTrace();
		return "/WEB-INF/views/error/authority.jsp";
	}
	
	
}
