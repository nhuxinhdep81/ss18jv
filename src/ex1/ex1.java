package ex1;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {
        Map<String, Double> students = new HashMap<>();
        students.put("Tien", 8.7);
        students.put("Doan", 8.2);
        students.put("Duong", 8.3);
        students.put("Hoang", 8.4);
        students.put("Nghia", 8.5);

        System.out.println("Danh sach sv: " + students);

        System.out.println("In ra diem so cua sv Tien: "+ students.get("Tien"));
    }
}
