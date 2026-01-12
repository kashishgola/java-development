package Oops.inheritance;


public class Main {
    public static void main(String[] args) {
        Car obj = new Car("BMW", 200, 5);
        obj.display();
//        obj.doors();

        Bike obj2 = new Bike("Hero Honda", 100, "Black");
//        obj2.bike();
        obj2.display();
    }
}
