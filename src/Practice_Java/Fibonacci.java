package Practice_Java;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {  //puede empeazar con 0 o 2 pq igual ya sabemos que los dos
            a = b;                          //primeros numberos son 1-1
            b = c;
            c = a + b;                    //a se vuelve b/ b se vuelve c/ y c es la suma de los dos

            System.out.println(a + "");
        }
    }

}
/*2DO WAY:
public static void main(String[] args) {

                          Scanner input =new Scanner(System.in);
                          System.out.println("Enter the number of times");
                          int number = input.nextInt();

                          int[] Fibonacci = new int[number];
                          Fibonacci[0] = 0;
                          Fibonacci[1] = 1;
                          for (int i = 2; i < number; i++) {
                              Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
                          }

                          System.out.println(Arrays.toString(Fibonacci));

                      }
}
 */
/*
1...1 are always the first numbers
1
1
2
3
5
8

 */
