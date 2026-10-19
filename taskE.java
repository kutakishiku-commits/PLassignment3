import java.util.Scanner;

public class taskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long x = scanner.nextLong();
        x = Math.abs(x);
        long sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        System.out.println(sum);
    }
}