import java.util.Scanner;

public class taskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) return;
        long x = scanner.nextLong();
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long reversed = 0;
        while (x > 0) {
            long digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if (isNegative) {
            reversed = -reversed;
        }

        System.out.println(reversed);
    }
}