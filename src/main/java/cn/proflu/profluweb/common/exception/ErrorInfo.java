package cn.proflu.profluweb.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorInfo<T> {

	public static final Integer OK=0;
	public static final Integer ERROR=100;
	
	
	private Integer code;
	private String message;
	private String url;
	private T data;
	
	
	
	
	
}
