package com.kh1.springhome.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 컨트롤러를 간섭하여 예외의 상황을 다르게 처리하도록 하는 객체
 등록시 @controllerAdvice라고 등록
 @restController를 간섭할 경우에는 @restControllerAdvice를 사용
 적용대상을 옵셥으로 지정
 */
//@ControllerAdvice(basePackages = {"com.kh1.springhome.controller"}) //절대표현
@ControllerAdvice(annotations = {Controller.class}) //어노테이션을 이용한 상대표현
public class ExpceptionControllerAdvice {
/**
 예외는 @ExceptionHandler 메소드로 처리 가능
 - 처리할 예외의 종류 지정 가능
 - 메소드의 형태는 컨트롤러와 같음
 - Try구문의  Catch 블록과 같은 역할을 수행
 */
	
	@ExceptionHandler(Exception.class)
	public String error() {
		return "/WEB-INF/views/error/500.jsp";
	}
}
