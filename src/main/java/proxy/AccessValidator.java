//designpatterns.proxy.AccessValidator.java
package proxy;

//验证
public class AccessValidator {

	public boolean validate(String userId) {
		System.out.println("用户" + userId + "进行验证");
		if (userId.equalsIgnoreCase("lth")) {
			System.out.println("用户" + userId + "验证成功");
			return true;
		}
		else {
			System.out.println("用户" + userId + "验证失败");
			return false;
		}
	}
}
