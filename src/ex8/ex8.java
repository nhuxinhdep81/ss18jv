package ex8;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("Nhap vao so nguyen duong");
            number = Integer.parseInt(scanner.nextLine());
            if(number < 1 || number > 3999){
                System.out.println("So khong hop le, nhap lai cho toiiiiiiii");
            }else {
                break;
            }
        }while(true);

        Map<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder romanNumber = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            int value = entry.getKey();
            while (number >= value) {
                romanNumber.append(entry.getValue());
                number -= value;
            }
        }

        System.out.println("Chu so La Ma: " + romanNumber);
    }
}
