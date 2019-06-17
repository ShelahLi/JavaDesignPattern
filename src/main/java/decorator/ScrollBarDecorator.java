//designpatterns.decorator.ScrollBarDecorator.java
package decorator;

//具体装饰类
public class ScrollBarDecorator extends ComponentDecorator {
	public ScrollBarDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("设置滚动条");
	}
}