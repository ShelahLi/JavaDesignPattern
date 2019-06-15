//designpatterns.proxy.dynamic.AbstractUserDAO.java
package proxy.dynamic;

//抽象用户DAO类，抽象主题
public interface AbstractUserDAO {
	public Boolean findUserById(String userId);
}
