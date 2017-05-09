package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice //��Ʈ�ѷ����� �߻��ϴ� Exception�� ���������� ó���ϴ� Ŭ������� ���� ���
public class CommonExceptionAdvice {
	private static final Logger logger = LoggerFactory.getLogger(CommonExceptionAdvice.class);
	
	//@ExceptionHandler(Exception.class)
	public String common(Exception e){ 
		//common() - Exception Ÿ������ ó���Ǵ� ��� ���ܸ� ó���ϵ��� ����
		logger.info(e.toString());
		return "error_common";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView errorModelAndView(Exception ex){
		//�Ϲ� Controller�� ���� Model�� �Ķ���ͷ� ����ϴ°��� �������� �ʱ� ������ ���� ModelAndViewŸ���� ����ϴ� ���·� �ۼ�
		//���������� ModelAndView�� ��ü�� �����ϰ� ��ȯ
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}
	
	
}
