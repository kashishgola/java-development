package Oops.constructors;

record Bike(String brand , int speed){

        }
public class RecordDemo {
    public static void main(String[] args) {
    Bike obj = new Bike("BMW", 120);
    System.out.println(obj.brand());
    System.out.println(obj.speed());
    //print the  full object
    System.out.println(obj);
    }
}
