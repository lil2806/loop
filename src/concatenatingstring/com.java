package concatenatingstring;
import java.util.Scanner;

public class com {

    public static void main(String[] args){

        String sA,sB;
        Scanner s = new Scanner(System.in);
        System.out.println("Type first bunch of random text: ");
        sA = s.nextLine();
        System.out.println("Type second bunch of random texts: ");
        sB= s.nextLine();

        sA=sA.concat(sA);

        System.out.println("The texts are:"+ sA);
        System.out.println(sA.compareTo(sB));
        System.out.println(sA.equalsIgnoreCase(sB));



    }



}
