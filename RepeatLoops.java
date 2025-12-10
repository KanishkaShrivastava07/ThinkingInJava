public class RepeatLoops{

    public static void run(){
        String code = "for(int i = 1; i <= 5; i++){ System.out.println(i); }";

        System.out.println("Repeat loops...");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
         while (!CodePractice.typeCode(code)) {
             System.out.println("Try again!");
         }
    }
}
