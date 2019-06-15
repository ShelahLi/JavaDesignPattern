//designpatterns.proxy.RealSearcher.java
package proxy;

//需要被代理的类
public class RealSearcher implements Searcher {
	public String doSearch(String userId, String keyword) {
		System.out.println("用户ID'" + userId + "密码" + keyword
				+ "信息是.....");
		return "查询成功";
	}
}
