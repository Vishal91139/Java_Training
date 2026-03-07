package DAY_09.collections.lambdaExpressions;

import java.util.*;

class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("mobile",20000,20));
        list.add(new Product("laptop",54000,12));
        list.add(new Product("camera",42000,16));
        Collections.sort(list, (p1,p2) -> p1.quantity - p2.quantity);
        for(Product p : list){
            System.out.println(p.name+" "+p.price+" "+p.quantity);
        }
    }
}
