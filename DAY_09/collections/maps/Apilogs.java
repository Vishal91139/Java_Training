package DAY_09.collections.maps;

import java.util.*;

public class Apilogs {
    public static void main(String[] args) {
        Map<String, String> logs = new LinkedHashMap<>();
        logs.put("2", "Signup");
        logs.put("1", "login");
        logs.put("4", "Browse Videos");
        logs.put("3", "Scroll up or scroll down");
        logs.put("5", "Logout");
        System.out.println("API logs: "+logs);
    }
}
