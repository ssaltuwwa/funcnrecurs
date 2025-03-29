import java.util.Scanner;

public class ReverseInput {
    public static void reverse(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int num = scanner.nextInt();
        reverse(n - 1, scanner);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        reverse(n, scanner);
    }
}
