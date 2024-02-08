public class CabRide{
	private String carName;
	private String driverName;
	String pickLocation;
	String dropLocation;
	int noPassengers;
	double runKM;
	double cabFare;
	final static double pricePerKM = 25.50;

	public CabRide(String carName,String driverName){
		this.carName = carName;
		this.driverName = driverName;
	}
	
	public void setpickLocation(String pickLocation){
		this.pickLocation = pickLocation;
	}
	public void setdropLocation(String dropLocation){
		this.dropLocation = dropLocation;
	}
	public void setnoPassengers(int noPassengers){
		this.noPassengers = noPassengers;
	}
	public void setrunKM(double runKM){
		this.runKM = runKM;
	}
	public void setcabFare(double cabFare){
		this.cabFare = cabFare;
	}
	public String getcarName(){
		return carName;
	}
	public String getdriverName(){
		return driverName;
	}
	public String getpickLocation(){
		return pickLocation;
	}
	public String getdroplocation(){
		return dropLocation;
	}
	public int getnoPassengers(){
		return noPassengers;
	}
	public double getrunKM(){
		return runKM;
	}
	public double getcabFare(){
		return cabFare;
	}
	
	public void displayRideDetails(){

		System.out.println("--Ride Details--");
		System.out.println("Car Name: "+ getcarName());
		System.out.println("Pickup Location: "+ getpickLocation());
		System.out.println("Drop Location: "+ getdroplocation());
		System.out.println("No of Passengers: "+ getnoPassengers());
		System.out.println("Kilometres of the ride: "+ getrunKM());
		System.out.println("Total fare for the ride: "+ getcabFare());
		System.out.println("--Thank You--");

	}
	static double CalculatecabFare(double runKM){
		double finalFare = runKM*pricePerKM;
		return finalFare;
	}	
public static void main(String[] args){
			CabRide Car = new CabRide("Toyota","John");
			Car.setpickLocation("Galle");
			Car.setdropLocation("Matara");
			Car.setnoPassengers(4);
			Car.setrunKM(45);
			double runKM = Car.getrunKM();
			double cabFare = CabRide.CalculatecabFare(runKM);
			Car.setcabFare(cabFare);
			Car.displayRideDetails();
		}
}