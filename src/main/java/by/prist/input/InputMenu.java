package by.prist.input;

import java.util.Scanner;

public class InputMenu {
    public static int inPutMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбор операции: ");
        System.out.println("1) сложение ");
        System.out.println("2) вычитание ");
        System.out.println("3) умножение ");
        System.out.println("4) деление ");
        System.out.println("0) выход ");
        return scanner.nextInt();
    }


}
