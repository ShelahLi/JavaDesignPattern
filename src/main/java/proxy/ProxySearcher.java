//designpatterns.proxy.ProxySearcher.java
package proxy;

//代理类
public class ProxySearcher implements Searcher {
	private RealSearcher searcher = new RealSearcher(); //维持一个（被被代理的对象的引用）
	private AccessValidator validator;
	private Logger logger;
	
	public String doSearch(String userId,String keyword) {
		//信息查询
		if (this.validate(userId)) {
			String result = searcher.doSearch(userId,keyword);
			this.log(userId);
			return result;
		}
		else {
			return null;
		}
	} 

	//验证
	public boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
	}
	
	//日志记录
	public void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}
}
