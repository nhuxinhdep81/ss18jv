package ex5;

import java.util.Map;
import java.util.TreeMap;

public class ex5 {
    public static void main(String[] args) {
        Map<String, Integer> products = new TreeMap<>();

        products.put("Laptop", 500);
        products.put("Iphone", 700);
        products.put("Apple", 2000);
        products.put("Tablet", 100);
        products.put("NoteBook", 600);

        // loc sp
        for(Map.Entry<String,Integer> entry : products.entrySet()){
            if(entry.getValue() >= 500 && entry.getValue() <= 1500){
                System.out.println("Ten sp: " + entry.getKey() + " - Gia: " + entry.getValue());
            }
        }
    }
}
