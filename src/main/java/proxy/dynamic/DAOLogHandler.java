//designpatterns.proxy.dynamic.DAOLogHandler.java
package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

//自定义请求处理程序类
public class DAOLogHandler implements InvocationHandler {
	private Calendar calendar;
	private Object object;
	
	public DAOLogHandler() {	
	}
	

	public DAOLogHandler(Object object) {
		this.object = object;
	}
	

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		beforeInvoke();//记录方法被调用的时间
		Object result = method.invoke(object, args);
		afterInvoke();
		return result;//返回结果
	}


	public void beforeInvoke(){
	  	calendar = new GregorianCalendar();
	  	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	  	int minute = calendar.get(Calendar.MINUTE);
	  	int second = calendar.get(Calendar.SECOND);
	  	String time = hour + ":" + minute + ":" + second;
	  	System.out.println("调用的时间：" + time);
	}

	public void afterInvoke(){
		System.out.println("调用结束" );
	}
}
