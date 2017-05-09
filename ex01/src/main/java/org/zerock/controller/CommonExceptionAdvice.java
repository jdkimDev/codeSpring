package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice //컨트롤러에서 발생하는 Exception을 전문적으로 처리하는 클래스라는 것을 명시
public class CommonExceptionAdvice {
	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	//@ExceptionHandler(Exception.class)
	public String common(Exception e){ 
		//common() - Exception 타입으로 처리되는 모든 예외를 처리하도록 설정
		logger.info(e.toString());
		return "error_common";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView errorModelAndView(Exception ex){
		//일반 Controller와 같이 Model을 파라미터로 사용하는것은 지원하지 않기 때문에 직접 ModelAndView타입을 사용하는 형태로 작성
		//내부적으로 ModelAndView의 객체를 생성하고 반환
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}
	
	
}
