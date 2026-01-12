package Oops.encapsulation;

 class Student{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
public class Main {
    public static void main(String[] args) {
    Student obj = new Student();
    obj.setName("Kashish");
    obj.setAge(22);
    System.out.println(obj.getName());

    System.out.println(obj.getAge());

    obj.setName("Rohit");
    obj.setAge(23);

    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    }
}
