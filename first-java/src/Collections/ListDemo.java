package Collections;

import java.util.ArrayList;
import java.util.List;



public class ListDemo {
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
        Car obj = new Car("BMW");
        Car obj2 = new Car("Ford");

        List<Car> carList = new ArrayList<>();
        carList.add(obj);
        carList.add(obj2);

        System.out.println("All Cars");
        for(Car car : carList){
            System.out.println(car.brand);
        }
    }
}
