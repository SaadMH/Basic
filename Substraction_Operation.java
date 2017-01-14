package Basic;

import java.util.Scanner;

public class Substraction_Operation {


    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    double number1, number2, result;
    
    System.out.println("Enter Number=");
    number1=input.nextDouble();
    
    System.out.println("Enter Number=");
    number2=input.nextDouble();
    
    result=number1-number2;
    System.out.println("Result="+result);
    }
    
}
