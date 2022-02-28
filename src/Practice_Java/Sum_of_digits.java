package Practice_Java;

public class Sum_of_digits {

    public static void main(String[] args) {


        int number = 2365;
        int sum = 0;
        int reminder;

        while (number > 0) {
            reminder =number %10;
            sum = sum +reminder;
            number= number/10;

        }
        System.out.println("Sum of digits is " + sum);
    }
}

