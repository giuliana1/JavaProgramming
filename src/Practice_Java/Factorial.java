package Practice_Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //n! = n factorial 5!=120
        int num; //the user's number
        int factorial = 1; //to store factorial number

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        num = scan.nextInt();

        for (int i = num; i >=1 ; i--) { //i es >=1, llega solo a 1
            factorial *= i;
        }
        System.out.println(factorial);
    }

}
