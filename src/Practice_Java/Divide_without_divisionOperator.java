package Practice_Java;

public class Divide_without_divisionOperator {


    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int count=0;

        while (a> b){
            a-=b;  //substract a>b
            count++; //the number of count is the result and a is whats left
        }
        System.out.println("The result of the division without operator is " + count + "." + a);


    }

}

