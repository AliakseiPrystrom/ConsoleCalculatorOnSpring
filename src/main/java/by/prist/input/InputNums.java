package by.prist.input;

import java.util.Scanner;

public class InputNums {
    public static double inPutNums(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        return scanner.nextDouble();
    }
}
