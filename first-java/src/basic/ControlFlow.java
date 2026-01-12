package basic;

import java.sql.SQLOutput;

public class ControlFlow {
    public static void main(String[] args) {
        int age = 20;
        if(age > 18){
            System.out.println("Welcome to our bank");
        }
        else{
            System.out.println("Sorry, you are not capable");
        }

        // if- else ladder
        int marks = 90;
        if(marks > 90){
            System.out.println("Grade A+");
        }
        else if(marks > 75){
            System.out.println("Grade A");
        }
        else if(marks > 60){
            System.out.println("Grade B");
        }else{
            System.out.println("Grade F");
        }

        // switch
        String day = "Sunday";
        switch(day){
            case "Monday"-> System.out.println("Start of the day");
            case "Friday"-> System.out.println("End of the day");
             default-> System.out.println("Enjoy of the day");
        }

        // Loops

        //For
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // While
        int num = 3;
        while(num > 0 ){
            System.out.println("Num " +num);
            num--;
        }

        //Do While
        int n = 0;
        do{
            System.out.println("Num " +n);
            n--;
        }while(n > 0);

        //Enhanced for each
        String[] fruits = {"Apple", "Banana"};
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        // break :- exit the loop
        for(int i = 0; i <= 10; i++){
            if(i == 3)
                break;
            System.out.println(i);
        }

        //Continue :- Skip the condition
        for(int i = 0; i <= 10; i++){
            if(i == 3)
                continue;
            if(i == 7)
                continue;
            System.out.println(i);
        }
    }
}
