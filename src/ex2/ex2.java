package ex2;

import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 9999.9);
        products.put("Samsung Galaxy", 9213.9);
        products.put("Samsung Galaxy1123", 213.9);

        System.out.println("Check xem sp laptop co ton tai khong:");
        if(products.containsKey("Laptop")){
            System.out.println("San pham co ton tai");
        }else{
            System.out.println("Sp khong ton tai");
        }

        if(products.containsValue(1000)){
            System.out.println("Co sp ton tai");
        }else {
            System.out.println("sp khong ton tai");
        }
    }
}
