package Oops.inheritance;

public class Bike extends Vehicle {
    private String color;

    public Bike(String brand, int speed, String color){
        super(brand, speed);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Brand: "+ getBrand() + " , Speed " + getSpeed()+ ", color" + color);
    }
}
