package Practice_Java;

public class FINRA {

    public static void main(String[] args) {

        int number = 100;

        for (int i = 1; i <=20 ; i++) {
            if(i % 15== 0) {
                System.out.println("FINRA");
            }else if(i % 3 == 0){
                System.out.println("FIN");
            }else if(i % 5 ==0){
                System.out.println("RA");
            }else{
                System.out.println(i+ " "); //los que no tienen esas condiciones se imprimen como el 1, 2
            }
        }
    }
}
