//designpatterns.decorator.BlackBorderDecorator.java
package decorator;

//具体装饰类
public class BlackBorderDecorator extends ComponentDecorator {
	public BlackBorderDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("设置黑色边框");
	}
}