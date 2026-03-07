import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter three numbers: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();

        if (number1 < number2 && number1 < number3)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }
}