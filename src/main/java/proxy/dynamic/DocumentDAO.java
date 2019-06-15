//designpatterns.proxy.dynamic.DocumentDAO.java
package proxy.dynamic;

//文档DAO类，真实主题
public class DocumentDAO implements AbstractDocumentDAO {
	public Boolean deleteDocumentById(String documentId) {
		if (documentId.equalsIgnoreCase("D001")) {
			System.out.println("文档ID" + documentId + "删除");
			return true;
		}
		else {
			System.out.println("文档ID" + documentId + "无法删除");
			return false;
		}
	}
}