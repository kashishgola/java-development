package Project;

    /* Build a system that:
        Fteches users from a database( we will mock it).
        Each user has roles(unique).

    we want to:
    - Remove inactive users
    - List all active users
    - Count users per role */

import java.util.Set;

public class Users {
    private String name;
    private boolean active;
    private Set<String> roles;   //  set for using unique roles
    public Users(String name, boolean active, Set<String> roles ) {
        this.name = name;
        this.active = active;
        this.roles = roles;
    }
    public boolean isActive() {
        return active;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // getter for roles
    public Set<String> getRoles() {
        return roles;
    }
}
