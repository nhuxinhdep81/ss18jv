package ex3;

import java.util.LinkedHashMap;
import java.util.Map;

public class ex3 {
    public static void main(String[] args) {
        Map<String,Double> products = new LinkedHashMap<>();
        products.put("Laptop", 9999.9);
        products.put("Samsung Galaxy", 9213.9);
        products.put("Samsung Galaxy1123", 213.9);
        products.put("Macbook", 100.9);
        products.put("tablet1", 200.9);

        System.out.println("Danh sach sp: " + products);

        products.put("Laptop", 2005.05);
        System.out.println("Sp lap top sau khi thay doi gia: " + products.get("Laptop"));


        products.remove("Macbook");
        System.out.println("Danh sach sp sau khi xoa sp macBook: " + products);
    }
}
