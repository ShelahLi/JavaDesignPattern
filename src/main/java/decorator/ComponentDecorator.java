//designpatterns.decorator.ComponentDecorator.java
package decorator;

//抽象装饰类
public class ComponentDecorator extends Component {
	private Component component;//维持一个抽象构件的引用
  

	public ComponentDecorator(Component component) {
		this.component = component;
	}


	public void display() {
		component.display();
	}
}