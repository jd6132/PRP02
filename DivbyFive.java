import java.util.Scanner;

public class DivbyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        boolean result = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + result);

        sc.close();
    }
}