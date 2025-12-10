public class BasicPrograms{

    public static void run() {
        String code = "System.out.print(5 + 7);";

        System.out.println("Basic program....");
        System.out.println("Output: ");
        System.out.println(5 + 7);

        while(!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
