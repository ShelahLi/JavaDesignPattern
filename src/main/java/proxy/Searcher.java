//designpatterns.proxy.Searcher.java
package proxy;

//抽象主题类
public interface Searcher {
	public String doSearch(String userId, String keyword);
}