//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("OPERATIONS\n");
        int a = 2;
        int b = 54;
        int choice;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.printf("Choose the operation to perform on the random variables:\n");
            System.out.printf("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit\n");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.printf("a + b = " + (a+b) +"\n");
                    break;

                case 2:
                    System.out.printf("a - b = " + (a-b) +"\n");
                    break;

                case 3:
                    System.out.printf("a * b = " + (a*b) +"\n");
                    break;

                case 4:
                    if(b==0){
                        System.out.printf("Division cannot be performed!\ninvalid numbers.\n");
                    }else{
                        System.out.printf("a / b = " + (a/b) +"\n");
                    }
                    break;

                case 5://not running!!!
                    if(b==0){
                        System.out.printf("Division cannot be performed!\ninvalid numbers.\n");
                    }else{
                        System.out.printf("a % b = " + (a%b) +"\n");
                    }
                    break;
            }
        }while(choice != 6);
        scanner.close();

    }
}