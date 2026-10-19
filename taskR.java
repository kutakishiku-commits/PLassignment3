import java.util.Scanner;

public class taskR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long e = scanner.nextLong();

        int count = 0;

        for (long x = 0; x <= 1000; x++) {
            if (x == e) {
                continue;
            }
            long numerator = a * x * x * x + b * x * x + c * x + d;

            if (numerator == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}