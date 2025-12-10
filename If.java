public class If{

    public static void run(){
        String code = "if(marks >= 33){ System.out.println(\"Passed\"); }";

        System.out.println("If statement.....");

        int marks = 75;

        if(marks >=  33){
            System.out.println("Passed");
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
