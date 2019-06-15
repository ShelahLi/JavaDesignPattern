//designpatterns.proxy.Client.java
package proxy;

public class Client {
	public static void main(String args[]) {
		Searcher searcher;
		searcher = new ProxySearcher();
		String result = searcher.doSearch("lth","1111");
	}
}
