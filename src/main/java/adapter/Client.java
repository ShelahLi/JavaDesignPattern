//designpatterns.adapter.Client.java
package adapter;

public class Client {
	public static void main(String args[]) {
		CarController car ;
		car = new PoliceCarAdapter();
		car.move();
		car.phonate();
		car.twinkle();
	}
}