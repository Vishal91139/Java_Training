package DAY_09.collections.maps;

import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin","admin@123");
        users.put("user1","pass1");
        users.put("user2","pass2");
        users.put("admin","admin@456");
        System.out.println(users);
    }
}
