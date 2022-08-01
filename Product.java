public abstract class Product {
    protected int id;
    protected String name;
    protected int price;

    void setProductDetails(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void printProductDetails(){
    };
    public static void main(String[]args){
        
    }
}

class LedTv extends Product {
    private String brand;
    private String technology;

    public void setProductDetails(int id, String name, int price, String brand, String technology) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.technology = technology;
    }
    public void printProductDetails() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println( brand);
        System.out.println(technology);
    }
}

class MobilePhone extends Product {
    private int ram;
    private String os;
    private int sdCard;

    public void setProductDetails(int id, String name, int price, int ram, String os, int sdCard) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.os = os;
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

class lab {
    public static void main(String[]args) {
        LedTv tv = new LedTv();
        MobilePhone ph = new MobilePhone();

        tv.setProductDetails(122, "Horizon", 45000, "Sony", "LED");
        ph.setProductDetails(246, "I11", 24000, 16, "Vivo", 32);
        tv.printProductDetails();
        ph.printProductDetails();  
    }
}