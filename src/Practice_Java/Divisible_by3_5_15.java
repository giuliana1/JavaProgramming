package Practice_Java;

public class Divisible_by3_5_15 {

    public static void main(String[] args) {

        String dibisibleby15="";   //int dibisibleby15=0; if I do it w/out "" and as an int#, the numbers will be add to each other ex.by15=15
        String dibisibleby3="";      //"" separates the numbers added to dibisible;
        String dibisibleby5="";

        for (int i = 1; i <= 100 ; i++) {

            if(i%3==0 && i%5==0 && i%15==0){
                dibisibleby15 += i + " ";  //space

            }else if (i%3==0 && !(i%15==0)){
                dibisibleby3 += i + " ";

            }else if(i%5==0 && !(i%15==0)){
                dibisibleby5+=i + " ";
            }
        }
        System.out.println("Dibisible by 15: " + dibisibleby15);
        System.out.println("Dibisible by 5: " + dibisibleby5);
        System.out.println("Dibisible by 3: " + dibisibleby3);

    }
}
