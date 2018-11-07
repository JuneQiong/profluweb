package cn.proflu.profluweb.common.exception;

public class ThisAssert {

	
	public  static void getThisExcepton(final  String message )throws ThisExcepton {
		throw   new ThisExcepton(message);
	}
	
	public  static void getIsNotNull(String str,final  String message)throws ThisExcepton {
		  if(str==null){
			  getThisExcepton(message);
		  }
	}
	
	
	
}
