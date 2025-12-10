public class Pattern {

    public static void run(){
        String code = "for(int i = 1; i <= 5; i++){\n" +
                "for(int j = 1; j <= i; j++){\n" +
                "  System.out.print(\"*\");\n" +
                " }\n" +
                "  System.out.println();\n" +
                "}";

        System.out.println("Pattern printing(Triangle)..");

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
