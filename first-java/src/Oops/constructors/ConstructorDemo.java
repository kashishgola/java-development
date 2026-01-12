package Oops.constructors;

public class ConstructorDemo {
    public static void main(String[] args) {
        Car obj = new Car("BMW","Black", 100);
//        obj.brand = "BMW";
//        obj.color = "Black";
//        obj.speed = 100;
        obj.drive();
    }
}
