
public class CarTest {
	public static void main(String[]args) {
		Car car1 = new ManualCar();
		Car car2 = new AutomaticCar();
		
		System.out.println(car1.getcarType());
		car1.turnonCar();
		car1.turnoffCar();
		
		System.out.println(car2.getcarType());
		car2.turnonCar();
		car2.turnoffCar();
	}

}
