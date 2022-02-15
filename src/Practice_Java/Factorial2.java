package Practice_Java;

import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {


        int factorial = 1; //baja desde el nro seleccionado hasta el 1. factorial accumulates the factorial #

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number to get factorial");
        int number = scan.nextInt(); //number is the number that user enters.

        for (int i = number; i >=1 ; i--) {
            factorial*= i;

        }
        System.out.println(factorial);


    }


}
