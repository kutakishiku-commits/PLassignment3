import java.util.Scanner;

public class taskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) return;
        long x = scanner.nextLong();

        long count = 0;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i * i == x) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }

        System.out.println(count);
    }
}