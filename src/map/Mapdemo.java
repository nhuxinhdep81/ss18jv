package map;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nguyen van a");
        students.put(1, "Nguyen van b");
        students.put(3,"Le dien tien");
        System.out.println("Thong tin sinh vien: "+students);

        System.out.println("Tra ve thong tin sv 1: "+students.get(1));

        System.out.println("Kiem tra key co ton tai khong," + students.isEmpty());

        System.out.println("Tra ve 1 mang key: " + students.keySet());
    }
}
