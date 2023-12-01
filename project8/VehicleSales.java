package L1_WE;

public class VehicleSales {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("SUV", "Toyota", 3000000);
        Car car1 = new Car("Honda", 2500000, 4);
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", 1500000, true);

        System.out.println("Vehicle 1:");
        System.out.println("Total Price is Rs." + vehicle1.calculateTotalPrice());
        System.out.println("Discounted Price for 20% is Rs." + vehicle1.calculateTotalPrice(20));
        System.out.println();

        System.out.println("Car 1:");
        System.out.println("Total Price is Rs." + car1.calculateTotalPrice());
        System.out.println("Discounted Price for 10% is Rs." + car1.calculateTotalPrice(10));
        System.out.println();

        System.out.println("Motorcycle 1:");
        System.out.println("Total Price is Rs." + motorcycle1.calculateTotalPrice());
        System.out.println("Discounted Price (8%): Rs." + motorcycle1.calculateTotalPrice(8));
    }
}
