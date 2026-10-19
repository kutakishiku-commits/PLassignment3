import java.util.Scanner;

public class taskM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == 0) {
                    zeroCount++;
                }
            }
        }

        System.out.println(zeroCount);
    }
}