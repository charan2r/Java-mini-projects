package L1_WE;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String manufacturer, double basePrice, int numberOfDoors) {
        super("Car", manufacturer, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateTax() {
        return 0.12 * basePrice;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice();
    }
}







