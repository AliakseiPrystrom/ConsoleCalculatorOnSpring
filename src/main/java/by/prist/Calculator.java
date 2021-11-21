package by.prist;

import by.prist.input.InputMenu;
import by.prist.input.InputNums;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getResult(int c,double y,double z){
        switch (c){
            case (1):return y+z;
            case (2):return y-z;
            case (3):return y*z;
            case (4):return y/z;
        }return 0;
    }

    public Calculator() {
    }

    public void run(){
            while (true){
            int x = InputMenu.inPutMenu();
            if (x==0){
            break;
            }else{
                double y = InputNums.inPutNums();
                double z = InputNums.inPutNums();
                double result = getResult(x,y,z);
                System.out.println(result);
            }
        }
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

}
