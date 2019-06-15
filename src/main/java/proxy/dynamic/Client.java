//designpatterns.proxy.dynamic.Client.java
package proxy.dynamic;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

public class Client {
	public static void main(String args[]) {
		InvocationHandler handler = null;
		AbstractUserDAO userDAO = new UserDAO();
		handler = new DAOLogHandler(userDAO);
		AbstractUserDAO userDaoProxy = null;
		

		userDaoProxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(), new Class[]{AbstractUserDAO.class}, handler);
    	userDaoProxy.findUserById("lth");
    
    	System.out.println("------------------------------");
   	
  		AbstractDocumentDAO docDAO = new DocumentDAO();
		handler = new DAOLogHandler(docDAO);
		AbstractDocumentDAO documentDAOProxy = null;
		
		documentDAOProxy = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(), new Class[]{AbstractDocumentDAO.class}, handler);
    	documentDAOProxy.deleteDocumentById("D002");
	} 
}
