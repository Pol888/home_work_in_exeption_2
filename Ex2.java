package home_work_in_exeption.ex2;

import java.util.Scanner;

public class Ex2 {
    private Scanner scanner;

    public  void printFloat(){
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Введите float");
                this.scanner = new Scanner(System.in);
                float f = scanner.nextFloat();
                flag = false;
                System.out.println("Введенное число - " + f);
            } catch (Exception e){
                System.out.println("Некорректный ввод");

            }

    }
}
    public  void printString() throws Exception {
        System.out.println("Введите строку");
        this.scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() == 0){
            throw new Exception("Exeption словил");
        }
    }
}
