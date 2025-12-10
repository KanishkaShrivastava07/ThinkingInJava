public class Logic{

    public static void run(){
        String code = "if(a < b) { System.out.println(\"a is smaller\"); }";

        System.out.println("Logic..");

        int a = 5;
        int b = 10;

        if(a < b){
            System.out.println("a is smaller");
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
