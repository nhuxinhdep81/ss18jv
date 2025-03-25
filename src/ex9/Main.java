package ex9;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Map<Integer, Product> products = new HashMap<>();

    public static void main(String[] args) {

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them san pham moi");
            System.out.println("2. Cap nhat san pham");
            System.out.println("3. Xoa san pham theo ID");
            System.out.println("4. Tinh tong gia tri san pham trong kho");
            System.out.println("5. In danh sach san pham");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    calculateTotalValue();
                    break;
                case 5:
                    printProducts();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while(true);
    }
    public static void addProduct() {
        System.out.println("Nhap vao id sp");
        int id = Integer.parseInt(sc.nextLine());
        if (products.containsKey(id)) {
            System.out.println("id san sp da ton tai");
        }else {
            System.out.println("nhap ten sp");
            String name = sc.nextLine();

            double price;
            do {
                System.out.println("Nhap gia sp");
                price = Double.parseDouble(sc.nextLine());
                if (price < 0) {
                    System.out.println("Gia khong duoc am");
                } else {
                    break;
                }
            } while (true);

            int quantity;
            do {
                System.out.println("Nhap vao so luong sp");
                quantity = Integer.parseInt(sc.nextLine());
                if (quantity < 0) {
                    System.out.println("so luong sp ko dc am");
                } else {
                    break;
                }
            } while (true);

            Product p = new Product(id, name, price, quantity);

            products.put(id, p);

            System.out.println("Them sp thanh cong");
        }
    }
    public static void updateProduct() {
        System.out.println("Nhap vao id sp");
        int id = Integer.parseInt(sc.nextLine());
        Product p = products.get(id);
        if (products.containsKey(id)) {
            boolean isOut = true;
            do {
                System.out.println("******CAP NHAT SP******");
                System.out.println("1. Ten san pham");
                System.out.println("2. Gia san pham");
                System.out.println("3. So luong san pham");
                System.out.println("0. Thoat...");
                System.out.println("Nhap vao lua chon cua ban.....");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Ten san pham moi:");
                        String newName = sc.nextLine();
                        p.setName(newName);
                        System.out.println("Cap nhat ten thanh cong");
                        break;
                    case 2:
                        System.out.println("Nhap vao gia sp moi");
                        Double newPrice = Double.parseDouble(sc.nextLine());
                        p.setPrice(newPrice);
                        System.out.println("Cap nhat gia sp thanh cong");
                        break;
                    case 3:
                        System.out.println("Nhap vao so luong sp moi");
                        int newQuantity = Integer.parseInt(sc.nextLine());
                        p.setQuantity(newQuantity);
                        System.out.println("Cap nhat so luong sp thanh cong");
                        break;
                    case 0:
                        System.out.println("thoat chuong trinh.");
                        isOut = false;
                        break;
                    default:
                        System.out.println("Nhap lai lua chon");
                }
            }while (isOut);
        }else{
            System.out.println("San pham khong ton tai");
        }
    }

    public static void deleteProduct() {
        System.out.println("Nhap vao id sp can xoa");
        int id = Integer.parseInt(sc.nextLine());
        if (products.containsKey(id)) {
            products.remove(id);
        }else{
            System.out.println("Khong co san pham voi id do");
        }
    }

    public static void calculateTotalValue() {
        double total = 0;
        for(Product p : products.values()){
            total += p.GetTotalValue();
        }
        System.out.println("Tong gia tri cac sp la: "+total);
    }

    public static void printProducts() {
        if(products.isEmpty()){
            System.out.println("Ko co san pham troing kho hang");
        }else{
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }

    }
}
