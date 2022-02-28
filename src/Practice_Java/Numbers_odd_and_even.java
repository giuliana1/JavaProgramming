package Practice_Java;

public class Numbers_odd_and_even {

    /*
    write a method that can identify if number is even or odd(5= odd/ 8=even)
     */
    public static void main(String[] args) {

        int number = 20;

            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
/*2nd way in method form:
 public static void odd_Or_Even(int number) {

        if(number %2 ==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
 */

