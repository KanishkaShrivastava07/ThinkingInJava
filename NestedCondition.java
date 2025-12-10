public class NestedCondition {

    public static void run(){
        String code = "if(n > 0) { if(n % 2 == 0){ System.out.println(\"Positive even\"); } else {System.out.println(\"Positive odd\"); } } else { System.out.println(\"Not positive\"); }";

        System.out.println("Nested Condition...");

        int n = 5;
        if(n > 0){
            if(n % 2 == 0){
                System.out.println("Positive even");
            }else{
                System.out.println("Positive odd");
            }
        }
        else{
            System.out.println("Not positive");
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
