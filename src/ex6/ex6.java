package ex6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ex6 {
    public static void main(String[] args) {
        Map<String, Double> students = new LinkedHashMap<>();
        students.put("Nguyễn Văn A", 8.2);
        students.put("Trần Thị B", 7.5);
        students.put("Phạm Văn C", 9.0);
        students.put("Vũ Thị D", 6.8);
        students.put("Lê Văn E", 7.9);
        students.put("Đỗ Thị F", 8.7);
        students.put("Phan Văn G", 6.4);
        students.put("Đinh Thị H", 7.3);
        students.put("Hoàng Văn I", 3.5);
        students.put("Ngô Thị J", 4.0);

        System.out.println("DAnh sach hs: \n" + students);

        double total = 0;
        for(Double score: students.values()) {
            total += score;
        }

        double average = total / students.size();
        System.out.println("Diem trung binh cua cac hs la: " + average);

        System.out.println("DAnh sach sau khi xoa hs: ");

        // nen dung iteractor de xoa ptu trong map de tranh loi ConcurrentModificationException

        Iterator<Map.Entry<String, Double>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            if (entry.getValue() < 5.0) {
                iterator.remove();
            }
        }
        System.out.println("Danh sach sau khi xoa hs: ");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
