
abstract class Vehicle {

    private String brand;
    private String model;
    private int price;
    
    public void setDetails(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    abstract void start();
    public void display() {
        System.out.println("Brand : " + getBrand());
        System.out.println("Model : " + getModel());
        System.out.println("Price : " + getPrice());
    }
}
class Car extends Vehicle {
	
    void start() {
        System.out.println(getBrand() + " " + getModel() + " Car Started");
    }
    public static void main(String[]args) {
        Car C= new Car();

        C.setDetails("Toyota", "Innova", 2500000);

        C.display();

        C.start();
    }
}