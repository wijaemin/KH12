package com.kh1.springhome.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh1.springhome.interceptor.TestInterceptor;
import com.kh1.springhome.interceptor.MemberInterceptor;

/**
 * 
 * 스프링에서 제공하는 설정파일 -application.properties에서 설정할수 없는 내용 들을 설정하는 파일
 * 
 * 만드는법 1.등록(@Configuration) 2.필요시 상속(WebMvcConfigurer)
 * 
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
	@Autowired
	private TestInterceptor testInterceptor;
	@Autowired
	private MemberInterceptor memberInterceptor;

//인터셉터를 추가할수있는 설정 메소드(registry 저장소에 설정)
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 1.TestInterceptor를 모든 주소처리과정에 간섭할수 있도록 설정하겠다.
//		registry.addInterceptor(testInterceptor).addPathPatterns("/**");// "/**"은 전부다 라는 뜻이다.

		//2.MemberInterceptor를 회원전용 페이지 처리 과정에서 간섭할수 있도록 설정
		registry.addInterceptor(memberInterceptor)
		.addPathPatterns("/member/**") //화이트리스트 전부다 등록후
		.excludePathPatterns("/member/join",
				"/member/joinFinish","/member/login","/member/exitFinish"); //허용할것을 등록
	}

}
