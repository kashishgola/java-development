package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "Kashish");
        userMap.put(2, "Rohit");
        userMap.put(3, "Neeraj");

        System.out.println(userMap.get(2));

        System.out.println("All users");
        for(Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
