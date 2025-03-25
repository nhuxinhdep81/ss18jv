package ex10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Employee> employ = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Them nhan vien moi");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3. Tinh tong luong cua tat ca nhan vien");
            System.out.println("4. Tinh luong trung binh");
            System.out.println("5. Tim nhan vien co luong cao nhat");
            System.out.println("6. Tim nhan vien co luong thap nhat");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    calculateTotalValue();
                    break;
                case 4:
                    calculateAverage();
                    break;
                case 5:
                    findHeighestSalary();
                    break;
                case 6:
                    findLowesttSalary();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while(true);
    }

    public static void addEmployee() {
        System.out.println("Nhap vao ten nhan vien: ");
        String name = scanner.nextLine();

        double salary;
        do {
            System.out.println("Nhap vao luong nhan vien: ");
            salary = Double.parseDouble(scanner.nextLine());
            if (salary < 0) {
                System.out.println("Luong khong duoc am, hay nhap lai");
            } else {
                break;
            }
        } while (true);

        Employee employee = new Employee(name, salary);
        employ.put(employee.getId(), employee);
        System.out.println("Them nhan vien thanh cong");
    }

    public static void displayEmployees() {
        if(employ.isEmpty()){
            System.out.println("Danh sach nhan vien trong");
        }else{
            System.out.println("**********Danh sach nhan vien************");
            for(Map.Entry<Integer, Employee> entry : employ.entrySet()) {
                System.out.println("ID: " + entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }

    public static void calculateTotalValue() {
        if(employ.isEmpty()){
            System.out.println("Danh sach nhan vien trong");
        }else {
            double total = 0;
            for(Employee emp : employ.values()){
                total += emp.getSalary();
            }
            System.out.println("Tong luong cua toan bo nhan vien: " + total);
        }

    }

    public static void calculateAverage() {
        if(employ.isEmpty()){
            System.out.println("Danh sach nhan vien trong");
        }else {
            double total = 0;
            for(Employee emp : employ.values()){
                total += emp.getSalary();
            }
            double average = total / employ.size();
            System.out.println("Luong trung biunh la: " +average);
        }

    }

    public static void findHeighestSalary() {
        if(employ.isEmpty()){
            System.out.println("Danh sach nhan vien trong");
        }else {
            //.stream() giúp chuyển danh sách values() của Map thành luồng dữ liệu.
            //
            //.findFirst() lấy phần tử đầu tiên trong danh sách.
            //
            //.get() lấy giá trị thực tế.
            Employee highestSalary = employ.values().stream().findFirst().get();

            for(Employee emp : employ.values()){
                if(emp.getSalary() > highestSalary.getSalary()){
                    highestSalary = emp;
                }
            }
            System.out.println("NV co luong cao nhat la: "+highestSalary);
        }
    }
    public static void findLowesttSalary() {
        if(employ.isEmpty()){
            System.out.println("Danh sach nhan vien trong");
        }else {
            Employee lowestSalary = employ.values().stream().findFirst().get();

            for(Employee emp : employ.values()){
                if(emp.getSalary() < lowestSalary.getSalary()){
                    lowestSalary = emp;
                }
            }
            System.out.println("NV co luong thap nhat la: "+lowestSalary);
        }
    }
}
