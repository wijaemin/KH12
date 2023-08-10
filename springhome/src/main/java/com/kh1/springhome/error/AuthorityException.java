package com.kh1.springhome.error;

import lombok.NoArgsConstructor;

/**
 권한과 관련된 문제가 발생한경우 사용할 예외 클래스
 - 로그인 하지 않은 경우
 - 로그인 했으나 권한이 부족한 경우
 - 자기 자신의 컨텐츠에만 접근해야 하는 경우(남에것에 접근했을 경우)
 */
@NoArgsConstructor
public class AuthorityException extends RuntimeException{


	public AuthorityException(String message) {
		super(message);
	
	}

}
