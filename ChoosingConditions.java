public class ChoosingConditions {

    public static void run(){
        String code = "if(age >= 18) { System.out.println(\"Adult\"); } else { System.out.println(\"Not an adult\"); } ";

        System.out.println("Choosing conditions...");

        int age = 20;

        if(age >= 18){
            System.out.println("Adult");
        } else{
            System.out.println("Not an adult");
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
