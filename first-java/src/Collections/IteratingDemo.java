package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Kashish");
        users.add("Rohit");
        users.add("John");
//        users.get(0);
       // List<User> userList = getFromDatabase();

        // for each
        System.out.println("Using for each");
        for(String user : users){
            System.out.println(user);
        }

        // for loop
        System.out.println("Using for loop");
        for(int i = 0; i < users.size(); i++){
            System.out.println(users.get(i));
        }

        // ITERATOR
        System.out.println("Using iterator");
        Iterator<String> it = users.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());

            if(it.next().equals("John")){
                it.remove();
            }
        }
        for(String user : users){
            System.out.println(user);
        }
    }
}
