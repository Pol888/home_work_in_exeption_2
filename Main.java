package home_work_in_exeption.ex2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1 task
        //new Ex2().printFloat();
        //--------------------------------------------
        // 2 task
        //int[] intArray = new int[]{3, 4, 6, 7, 6, 5, 4, 3};
//
        //try {
        //        int d = 0;
        //        double catchedRes1 = intArray[8] / d;
        //        System.out.println("catchedRes1 = " + catchedRes1);
        //    } catch (IndexOutOfBoundsException e){
        //        System.out.println("IndexOutOfBounds exception: " + e);
        //    }
        //catch (ArithmeticException  e) {
        //        System.out.println("Catching exception: " + e);
        //    } catch (Exception e){
        //        System.out.println("...................................");
        //}
        //--------------------------------------------------------
        //
            //try {
            //        int a = 90;
            //        int b = 3;
            //        System.out.println(a / b);
            //        printSum(23, 234);
            //        int[] abc = { 1, 2 };
            //        abc[3] = 9;
            //    } catch (NullPointerException ex) {
            //        System.out.println("Указатель не может указывать на null!");
            //    } catch (IndexOutOfBoundsException ex) {
            //        System.out.println("Массив выходит за пределы своего размера!");
            //    }
            //catch (Throwable ex) {
            //        System.out.println("Что-то пошло не так...");
            //    }

        new Ex2().printString();

    }








        public static void printSum(Integer a, Integer b) throws FileNotFoundException {
            System.out.println(a + b);
        }
    }

