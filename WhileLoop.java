public class WhileLoop{

    public static void run(){
        String code = "int n = 1; while(n <= 5) { System.out.println(n); n++; }";

        System.out.println("While Loop....");

        int n = 1;
        while(n <= 5){
            System.out.println(n);
            n++;
        }

        while(!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
