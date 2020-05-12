public class Hangar {

    public static void main(String[] args){

        Car karl = new Car("Karl");
        karl.setKilometers(76);

        System.out.println("1. Car brand is:" + karl.getBrand());
        System.out.println("2. She has " + (karl.getKilometers() + "km"));
        System.out.println(karl.doStuff());

        Boat yacht = new Boat("Yacht");
        System.out.println(yacht.doStuff());

    }

}
