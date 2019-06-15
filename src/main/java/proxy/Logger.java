//designpatterns.proxy.Logger.java
package proxy;


public class Logger {

	public void log(String userId) {
		System.out.println("用户" + userId + "'日志开始记录");
	}
}