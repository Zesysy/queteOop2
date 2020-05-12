public abstract class Vehicle {

    // attributes
    private String brand;
    private int kilometers;

    // constructor
    public Vehicle(String brand){
        this.brand = brand;
        this.kilometers = 0;
    }

    // getter & setters
    public String getBrand() { return this.brand;}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() { return this.kilometers;}

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // abstract method
    public abstract String doStuff();
}
