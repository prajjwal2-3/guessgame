import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        int[] arr= new int[10];
        for (int i = 0; i <arr.length; i++) {
       arr[i] = i;
        }
        Random gu = new Random();
        int ran = gu.nextInt(arr[0],arr[9]);
        System.out.println("Guess the number");
        boolean but = true;

        Scanner in = new Scanner(System.in);

        while(but){

            int g = in.nextInt();
        if(ran==g){
            System.out.println("Booyah!!!! you guessed it right");
            but = false;
        }else if(ran<g){
            System.out.println("oops!!! you guessed it wrong");
            System.out.println("Hint:The number is smaller than that");
        }else if(ran>g){
            System.out.println("oops!!! you guessed it wrong");
            System.out.println("Hint:The number is greater than that");
        }
        }


    }
}
