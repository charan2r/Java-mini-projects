package project3;

public class LedTv extends Product {
    private String brand;
    private String technology;
	
	public LedTv(String name, int id, int price) {
		super();
		this.setbrand(brand);
		this.settechnology(technology);
	}
	
	 public LedTv(int id, String name, int price, String brand, String technology) {
	        super();
	        this.brand = brand;
	        this.technology = technology;
	}
	 
	public void dowork(String work) {
		System.out.println("Doing " +work);
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
	public String technology() {
		return brand;
	}
	public void settechnology(String technology) {
		this.technology = technology;
	}
	
	 public void printProductDetails() {
	        System.out.println(id);
	        System.out.println(name);
	        System.out.println(price);
	        System.out.println(brand);
	        System.out.println(technology);
	 }
}