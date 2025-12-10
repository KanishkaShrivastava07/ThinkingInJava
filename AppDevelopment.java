public class AppDevelopment {

    public static void run(){
        String code = "new JFrame().setVisible(true);";

        System.out.println("App development example..");

        System.out.println("App: " + code);
        System.out.println("This creates and shows a small window");

        while (!CodePractice.typeCode(code)){
            System.out.println("Try again!");
        }
    }
}
