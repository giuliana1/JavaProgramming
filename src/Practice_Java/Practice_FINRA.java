package Practice_Java;

public class Practice_FINRA {
    /*
    Write a method which prints out the numbers from 1 to 30
    but for numbers which are a multiple of 3print "FIN" instead of the number and
    for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5,print "FINRA" instead of the number.
     */

    public static void main(String[] args) {

        int number= 15;

        if(number % 3== 0 && number % 5==0){
            System.out.println("FINRA");
        }else if(number % 5==0){
            System.out.println("RA");
        }else if( number%3==0)
            System.out.println("FIN");
        }
    }
