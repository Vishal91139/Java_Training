package Day_05.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = null;
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the data: ");
            str = br.readLine();
            System.out.println(str);
            br.close(); // not needed - closed automatically by autoclosable
        } 
    }
}
