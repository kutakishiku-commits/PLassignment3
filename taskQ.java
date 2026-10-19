import java.util.Scanner;

public class taskQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        StringBuilder sb = new StringBuilder();
        for (long x = 1000; x >= 0; x--) {
            long value = a * x * x * x + b * x * x + c * x + d;

            if (value == 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(x);
            }
        }

        System.out.println(sb.toString());
    }
}