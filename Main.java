import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("THINKING IN JAVA <33");
            System.out.println("1. Basic Programs");
            System.out.println("2. Repeat Loops");
            System.out.println("3. While Loops");
            System.out.println("4. Logic in Programs");
            System.out.println("5. Pattern Printing");
            System.out.println("6. Choosing Conditions");
            System.out.println("7. Nested Loops");
            System.out.println("8. If Statements");
            System.out.println("9. If-Else Statements");
            System.out.println("10. Nested Conditions");
            System.out.println("11. Web Development Example");
            System.out.println("12. Automation Example");
            System.out.println("13. App Development ");
            System.out.println("14. Practice Here");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            int choice = scn.nextInt();

            switch (choice){
                  case 1 ->
                      BasicPrograms.run();
                  case 2 ->
                      RepeatLoops.run();
                  case 3 ->
                      WhileLoop.run();
                  case 4 ->
                      Logic.run();
                  case 5 ->
                      Pattern.run();
                  case 6 ->
                      ChoosingConditions.run();
                  case 7 ->
                      NestedLoop.run();
                  case 8 ->
                      If.run();
                  case 9 ->
                      IfElse.run();
                  case 10 ->
                      NestedCondition.run();
                  case 11 ->
                      WebDevelopment.run();
                  case 12 ->
                      Automation.run();
                  case 13 ->
                      AppDevelopment.run();
                  case 14 ->
                      PracticeArea.run();
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
