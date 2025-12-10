public class WebDevelopment {

    public static void run(){

        String code = "@GetMapping(\"/hi\")";

        System.out.println("Web development...");

        System.out.println("Spring boot endpoint: " + code);
        System.out.println("This Would respond with: Hello!");

        System.out.println("Output: ");
        System.out.println("ET /hi -> Hello!");


        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
