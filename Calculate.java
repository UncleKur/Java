import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        int x = 0;
        int first = 0;
        int second = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate");
        System.out.println("Which operation do you want to do: 1, 2, 3, 4 or 5?");
        System.out.println("1 - Sum (+) ");
        System.out.println("2 - Multi (*)");
        System.out.println("3 - Del (/) ");
        System.out.println("4 - Raz (-) ");
        System.out.println("5 - Step (^) ");

        try {
            x = sc.nextInt();
            if (x < 1 || x > 5) {
                System.out.println("Wrong choice ");
            } else {

                System.out.println("Input first number: ");
                first = sc.nextInt();
                System.out.println("Input second number: ");
                second = sc.nextInt();

                switch (x) {
                    case 1:
                        int sum = first + second;
                        System.out.println("sum = " + sum);
                        break;

                    case 2:
                        int multi = first * second;
                        System.out.println("multi = " + multi);
                        break;

                    case 3:
                        int del = first / second;
                        System.out.println("del = " + del);
                        break;

                    case 4:
                        int raz = first - second;
                        System.out.println("raz = " + raz);
                        break;

                    case 5:
                        int step = (int) Math.pow(first, second);
                        System.out.println("step = " + step);
                        break;

                    default:
                        System.out.println("Wrong types!");
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Exception IME");
        }

    }
}
