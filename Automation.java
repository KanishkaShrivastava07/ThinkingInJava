public class Automation {

    public static void run() {

        String code = "Runtime.getRuntime().exec(\"notepad\");";

        System.out.println("Automation example..");

        System.out.println("Java automation: "  +code);
        System.out.println("This commands open Notepad automatically");

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
