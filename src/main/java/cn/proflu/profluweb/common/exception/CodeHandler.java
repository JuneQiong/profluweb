package cn.proflu.profluweb.common.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CodeHandler {

	
	@ExceptionHandler(value=ThisExcepton.class)
	@ResponseBody
	public  ErrorInfo<String> jsonErrorHandler(HttpServletRequest req,ThisExcepton ex)throws Exception{
		  ErrorInfo<String> errorInfo = new ErrorInfo<>();
		  errorInfo.setMessage(ex.getMessage());
		  errorInfo.setCode(ErrorInfo.ERROR);
		  errorInfo.setData("Date");
		  errorInfo.setUrl(req.getRequestURL().toString());
		  return errorInfo;
	}
	
	
	
}
