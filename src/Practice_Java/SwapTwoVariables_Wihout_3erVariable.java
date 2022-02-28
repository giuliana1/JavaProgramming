package Practice_Java;

import java.util.Scanner;

public class SwapTwoVariables_Wihout_3erVariable {

    public static void main(String[] args) {

        int a=0;
        int b=0;

        System.out.println("Enter two numbers");
        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        b= scan.nextInt();

        a=a+b;  //a=2+5=7
        b=a-b;  // a becomes 7... so a-b=2
        a=a-b;  //  a= 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
    }



    //in order to swapt numbers without a variable, we have to use addition and subtraction
    

