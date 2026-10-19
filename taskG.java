import java.util.Scanner;

public class taskG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int x = scanner.nextInt();
        int minDivisor = x;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                minDivisor = i;
                break;
            }
        }

        System.out.println(minDivisor);
    }
}
