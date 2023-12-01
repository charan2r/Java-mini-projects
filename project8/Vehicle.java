package L1_WE;

public class Vehicle {
	private String vehicleType;
	private String manufacturer;
	protected double basePrice;
	
	public Vehicle(String VehicleType, String manufacture, double basePrice) {
		this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.basePrice = basePrice;
	}
	
	public double calculateTax() {
        return 0.1 * basePrice;
    }

    public double calculateTotalPrice() {
        return basePrice + calculateTax();
    }

    public double calculateTotalPrice(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            double discount = (discountPercentage / 100) * calculateTotalPrice();
            return calculateTotalPrice() - discount;
        } else {
            return calculateTotalPrice();
        }
    }

}
