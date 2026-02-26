package Day_04.TransientKeyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
    String username = "Vishal";
    transient String password = "12345";
}

class TransientDemo {
    public static void main(String[] args) throws Exception{
        User user = new User();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User user2 = (User) ois.readObject();
        System.out.println(user2.username);
        System.out.println(user2.password);
    }
}
