package Collections;

import java.util.ArrayList;
import java.util.List;

class CarNew {
    String brand;

    public CarNew(String brand){

        this.brand = brand;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Allow the duplicate data without generics
        List users = new ArrayList<>();
        users.add("Alice");
        users.add("Kashish");
        users.add("Rohit");
        users.add(1);

        //Don't allow the duplicate data with generics
        List <String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Kashish");
        students.add("Rohit");
//       students.add(1);

        System.out.println("All users");
        for(Object user : users){
            System.out.println(user);
        }
        System.out.println("Elements using index: " + students.get(0));

        // List of Objects
        CarNew obj = new CarNew("BMW");
        CarNew obj2 = new CarNew("Ford");

        List<CarNew> carList = new ArrayList<>();
        carList.add(obj);
        carList.add(obj2);

        System.out.println("All Cars");
        for(CarNew car : carList){
            System.out.println(car.brand);
        }
    }
}
