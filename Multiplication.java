package Basic;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    int number1, number2, result;
    
    System.out.println("Enter Number=");
    number1=input.nextInt();
    
    System.out.println("Enter Number=");
    number2=input.nextInt();
    
    result=number1*number2;
    System.out.println("Result="+result);
    }
    }
