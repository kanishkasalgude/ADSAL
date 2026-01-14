import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("SWAP 2 NUMBERS\nEnter first number :");
        a = scanner.nextFloat();
        System.out.printf("\nEnter second number :");
        b = scanner.nextFloat();

        float temp = a;
        a = b;
        b = temp;

        System.out.printf("\nSwapped numbers :\nfirst number = " + a + "\nsecond number = " + b + "\n");

        System.out.printf("\n\nSQUARE OF GIVEN NUMBER\nEnter number :");
        a = scanner.nextFloat();
        System.out.printf("square = " + a * a);

        System.out.printf("\n\nCUBE OF GIVEN NUMBER\nEnter number :");
        a = scanner.nextFloat();
        System.out.printf("cube = " + a * a * a);

        System.out.printf("\n\nCHECK EVEN/ODD\nEnter number :");
        a = scanner.nextFloat();
        if (a % 2 == 0) {
            System.out.printf("\nThe number is even.\n");
        } else {
            System.out.printf("\nThe number is odd.\n");
        }

        System.out.printf("\n\nLARGEST OF 3 NUMBERS\nEnter first number :");
        a = scanner.nextFloat();
        System.out.printf("Enter second number :");
        b = scanner.nextFloat();
        System.out.printf("Enter third number :");
        c = scanner.nextFloat();
        float largest;

        if (a > b) {
            if (a > c) largest = a;
            else largest = c;
        } else {
            if (b > c) largest = b;
            else largest = c;
        }

        System.out.printf("Largest among the 3 is " + largest);

        System.out.printf("\n\nCHECK POSITIVE/NEGATIVE/ZERO\nEnter the number :");
        a = scanner.nextFloat();
        if (a > 0) {
            System.out.printf("The number is positive.\n");
        } else if (a < 0) {
            System.out.printf("The number is negative.\n");
        } else {
            System.out.printf("The number is zero.\n");
        }

        System.out.printf("\n\nCHECK WHETHER LEAP YEAR\nEnter the year :");
        a = scanner.nextFloat();
        if (a % 4 == 0) System.out.printf("\nIt is a leap year!\n");
        else System.out.printf("\nIt is NOT a leap year.\n");

        System.out.printf("\n\nSUM OF N NUMBERS\nEnter the number of numbers :");
        a = scanner.nextFloat();
        System.out.printf("\nSum = " + a * (a + 1) / 2);

        System.out.printf("\n\nREVERSE THE GIVEN NUMBER\nEnter the number :");
        a = scanner.nextFloat();
        String n = String.valueOf(a);
        String rev = "";
        for (int i = 0; i < n.length(); i++) {
            rev = i + rev;
        }
        System.out.printf("Reversed number = " + rev);

        System.out.printf("\n\nCHECK PALINDROME\nEnter the number :");
        a = scanner.nextFloat();
        String first = String.valueOf(a);
        String r = "";
        for (int i = 0; i < n.length(); i++) {
            r = i + r;
        }
        if (first == r) System.out.printf("\nIt is palindrome!\n");
        else System.out.printf("\nIt is not a palindrome!\n");

        System.out.printf("\n\nCHECK PRIME\nEnter the number :");
        a = scanner.nextFloat();


        System.out.printf("\n\nFIND FACTORIAL\nEnter number :");
        a = scanner.nextFloat();
        float factorial = 1;
        for (int i = 2; i <= a; i++) {
            factorial *= i;
        }
        System.out.printf("\nfactorial is " + factorial);

        System.out.printf("\n\nFIBONACCI SERIES\nEnter n :");
        a = scanner.nextFloat();
        float prev = 0;
        float t = 1;
        System.out.printf(prev + " ");
        for(int i=0; i<a-2; i++){
            System.out.printf(t + " ");
            t = t+prev;
            prev = t - prev;
        }
        scanner.close();

    }
}