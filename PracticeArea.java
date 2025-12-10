import java.util.Scanner;

public class PracticeArea {

    public static void run(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Practice area...");

        System.out.print("Type anything: ");
        String s = scn.nextLine();

        System.out.println("You typed: " + s);
    }
}
