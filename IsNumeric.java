import java.util.Scanner;

public class IsNumeric {
    public static boolean isNumeric(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isNumeric(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();

        if (isNumeric(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
