public class IfElse{

    public static void run(){
        String code = "if(str1.equals(str2)) {System.out.println(\"They are equal\");} else {System.out.println(\"They are not equal\"); }";

        System.out.println("If Else...");

        String str1 = "UTA";
        String str2 = "UTA";

        if(str1.equals(str2)){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
