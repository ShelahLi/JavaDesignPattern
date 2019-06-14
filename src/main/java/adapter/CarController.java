//designpatterns.adapter.CarController.java
package adapter;

public abstract class CarController {
	public void move() {
		System.out.println("车运行");
	}
	
	public abstract void phonate();
	public abstract void twinkle();
}