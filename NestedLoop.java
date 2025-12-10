public class NestedLoop {

    public static void run(){
        String code = "for(int i=0;i<=3;i++){ for(int j=0;j<=3;j++){ System.out.print(j +\" \"); } System.out.println();} ";

        System.out.println("Nested loops...");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
