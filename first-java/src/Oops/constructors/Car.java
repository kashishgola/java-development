package Oops.constructors;

public class Car {

        //properties
        String brand;
        String color;
        int speed;

        public Car(String brand, String color, int speed){
                System.out.println("Constructor called");
                this.brand = brand;
                this.color = color;
                this.speed = speed;
        }


        // behavior
        public void drive()
        {
            System.out.println(brand + " is driving at " + speed + " & color is "+ color );
        }


}
