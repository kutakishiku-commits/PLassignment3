import java.util.Scanner;

public class taskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextLong()) {
                sum += scanner.nextLong();
            }
        }

        System.out.println(sum);
    }
}