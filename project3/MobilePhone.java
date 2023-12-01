package project3;

public class MobilePhone extends Product {
    private int ram;
    private String os;
    private int sdCard;
	
	public MobilePhone(int i, String name, int id, int price, String string, int j) {
		super();
		this.setos(os);
		this.setram(ram);
		this.setsdCard(sdCard);
	}
	
	public void dowork(String work) {
		System.out.println("Doing " +work);
	}
	public String getos() {
		return os;
	}
	public void setos(String os) {
		this.os = os;
	}
	public int ram() {
		return ram;
	}
	public void setram(int ram) {
		this.ram = ram;
	}
	public int sdCard() {
		return sdCard;
	}
	public void setsdCard(int sdCard) {
		this.sdCard = sdCard;
	}	
	
	public void printProductDetails() {
	        System.out.println(id);
	        System.out.println(name);
	        System.out.println(price);
	        System.out.println(ram);
	        System.out.println(os);
	        System.out.println(sdCard);
	 }
}
