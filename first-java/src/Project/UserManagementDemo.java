package Project;

import java.util.*;


public class UserManagementDemo {
    public static void main(String[] args) {
//        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN", "USER"));
//        Users user1 = new Users("Kashish", true,user1Roles );

        List<Users> user = new ArrayList<>();
        user.add(new Users("Kashish", true,
                new HashSet<>(Arrays.asList("ADMIN", "USER"))));

        user.add(new Users("Rohit", true,
                new HashSet<>(Arrays.asList( "USER"))));

        user.add(new Users("Neeraj", false,
                new HashSet<>(Arrays.asList("USER"))));

        // Remove inactive users
        Iterator<Users> it = user.iterator();
        while(it.hasNext()){
            if(!it.next().isActive()){
                it.remove();
            }
        }
        System.out.println("Active users");
        for(Users users : user){
            System.out.println(users.getName());
        }

        // count users per role
        Map<String, Integer> roleCount = new HashMap<>();

        //MANAGER : 1
        // ADMIN : 1
        for(Users users : user){
            for(String role: users.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }

        System.out.println("All roles : Count");
        for(Map.Entry<String, Integer> entry : roleCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
