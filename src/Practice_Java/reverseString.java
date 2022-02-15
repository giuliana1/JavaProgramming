package Practice_Java;

public class reverseString {

    public static void main(String[] args) {

        String word = "GiulianaPuede";

        String reversed = ""; //YOU HAVE TO INITIALIZE THE STRING WITH "", OR YOU GET ERROR

        for (int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        System.out.println(reversed);
    }
}
