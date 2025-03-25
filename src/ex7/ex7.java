package ex7;

import java.util.*;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang:");
        int num = Integer.parseInt(sc.nextLine());
        if (num < 0) {
            System.out.println("So luong ptu khong hop le");
        } else {
            int[] array = new int[num];
            System.out.println("Nhap cac phan tu cua mang:");
            for (int i = 0; i < num; i++) {
                array[i] = Integer.parseInt(sc.nextLine());
            }
            Map<Integer, Integer> counts = new HashMap<>();
            for (Integer value : array) {
                counts.put(value, counts.getOrDefault(value, 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counts.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                    return entry1.getValue().compareTo(entry2.getValue());
                }
            });

            System.out.println("Danh sach sau khi sap xep:");
            for (Map.Entry<Integer, Integer> entry : list) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
