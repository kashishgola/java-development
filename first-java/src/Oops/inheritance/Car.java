package Oops.inheritance;

public class Car extends Vehicle{
    private int doors;

    public Car(String brand, int speed, int doors){
        super(brand, speed);
        this.doors= doors;
    }

    public int getDoors(){
        return doors;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Brand: "+ getBrand() + " , Speed " + getSpeed()+ ", Doors" + doors);
    }
}