package OOP;

class User {
    private int ID;
    private String name;
    private String email;

    public User(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    // Getter and setter methods for ID, name, and email
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display user's information
    public void displayUserInfo() {
        System.out.println("User ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Customer extends User {
    private int starPoints;

    public Customer(int ID, String name, String email, int starPoints) {
        super(ID, name, email);
        this.starPoints = starPoints;
    }

    // Getter and setter methods for starPoints
    public int getStarPoints() {
        return starPoints;
    }

    public void setStarPoints(int starPoints) {
        this.starPoints = starPoints;
    }

    // Override displayUserInfo method to include starPoints
    @Override
    public void displayUserInfo() {
        System.out.println("Star Points: " + starPoints);
    }
}

class Order {
    private String itemName;
    private int quantity;
    private double price;

    public Order(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotalCost() {
        return quantity * price;
    }

    public double calculateTotalCost(double discountPercentage) {
        double totalCost = calculateTotalCost();
        double discount = totalCost * (discountPercentage / 100);
        return totalCost - discount;
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        User user = new User(101, "John Doe", "johndoe@example.com");
        Customer customer = new Customer(101, "John Doe", "johndoe@example.com", 500);
        Order order = new Order("Shirt", 3, 25);

        // Display user information
        user.displayUserInfo();
        System.out.println();

        // Display customer information
        customer.displayUserInfo();
        System.out.println();

        // Calculate total cost without discount
        double totalCostWithoutDiscount = order.calculateTotalCost();
        System.out.println("Total Cost (without discount): $" + totalCostWithoutDiscount);

        // Calculate total cost with 10% discount
        double totalCostWithDiscount = order.calculateTotalCost(10);
        System.out.println("Total Cost (with 10% discount): $" + totalCostWithDiscount);
    }
}
