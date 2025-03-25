package ex4;

import java.util.Map;
import java.util.TreeMap;

public class ex4 {
    public static void main(String[] args) {
        Map<String, Double> employ = new TreeMap<>();
        employ.put("NV003", 1000.1);
        employ.put("NV002", 1000.2);
        employ.put("NV001", 1000.3);
        employ.put("NV005", 1000.4);
        employ.put("NV004", 1000.5);

        System.out.println("Danh sach nhan vien cua treeMap : " + employ);

        // thay doi luong
        employ.put("NV001", 2807.05);
        System.out.println("CAp nhat luong cua nv 001: " + employ.get("NV001"));

        // xoa 1 ng
        employ.remove("NV001");
        System.out.println("Danh sach nhan vien sau khi xoa cua treeMap : " + employ);

    }
}
