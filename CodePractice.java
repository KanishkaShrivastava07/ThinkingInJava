import java.util.Scanner;

public class CodePractice {

    public static boolean typeCode(String expected){
        Scanner scn = new Scanner(System.in);

        System.out.println("Type the code to practice...");
        System.out.println(expected);


        System.out.println("Type here: ");
        String userInput = scn.nextLine();

        if(userInput.equals(expected)){
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Incorrect");
            return false;
        }
    }
}
