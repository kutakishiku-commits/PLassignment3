import java.util.Scanner;

public class taskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long x = scanner.nextLong();
        int d = scanner.nextInt();
        x = Math.abs(x);
        int count = 0;
        if (x == 0) {
            if (d == 0) {
                count = 1;
            }
        } else {
            while (x > 0) {
                if (x % 10 == d) {
                    count++;
                }
                x /= 10;
            }
        }

        System.out.println(count);
    }
}