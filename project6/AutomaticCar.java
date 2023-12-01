
public class AutomaticCar implements Car {
   private String carType = "Automatic";
	
	public void turnonCar() {
		System.out.println("turn on the automatic car");
	}
	public void turnoffCar() {
		System.out.println("turn off the automatic car");
	}
	public String getcarType() {
		return this.carType;
	}


}
