package project3;

public abstract class Product {
    protected int id;
    protected String name;
    protected int price;

    public void setProductDetails(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public static void main(String[]args) {
    	LedTv tv = new LedTv(122, "Horizon", 45000, "Sony", "LED");
        MobilePhone ph = new MobilePhone(246, "I11", 24000, 16, "Vivo", 32);
        tv.printProductDetails();
        ph.printProductDetails(); 
   }
    
    
}

