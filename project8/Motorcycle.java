package L1_WE;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String manufacturer, double basePrice, boolean hasSidecar) {
        super("Motorcycle", manufacturer, basePrice); 
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateTotalPrice() {
        if (hasSidecar) {
            return super.calculateTotalPrice() + 1000;
        } else {
            return super.calculateTotalPrice();
        }
    }
}
