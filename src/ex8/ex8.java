package ex8;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex8 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(11, "XI");
        map.put(12, "XII");
        map.put(13, "XIII");
        map.put(14, "XIV");
        map.put(15, "XV");
        map.put(16, "XVI");
        map.put(17, "XVII");
        map.put(18, "XVIII");
        map.put(19, "XIX");
        map.put(20, "XX");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so tu 1 den 20:");
        int number = Integer.parseInt(sc.nextLine());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(number == entry.getKey()) {
                System.out.printf("Ky hieu la ma tuong ung voi %d la %s", number, entry.getValue());
            }
        }
    }
}
