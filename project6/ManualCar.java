
public class ManualCar implements Car {
	private String carType = "Manual";
	
	public void turnonCar() {
		System.out.println("turn on the manual car");
	}
	public void turnoffCar() {
		System.out.println("turn off the manual car");
	}
	public String getcarType() {
		return this.carType;
	}

}
