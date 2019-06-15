//designpatterns.proxy.dynamic.UserDAO.java
package proxy.dynamic;

//UserDAO类，真实主题
public class UserDAO implements AbstractUserDAO {
	public Boolean findUserById(String userId) {
		if (userId.equalsIgnoreCase("lth")) {
			System.out.println("用户ID" + userId + "找到");
			return true;
		}
		else {
			System.out.println("用户ID" + userId + "没找到");
			return false;
		}
	}
}
