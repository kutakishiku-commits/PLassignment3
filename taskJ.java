import java.util.Scanner;

public class taskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sum = 0;
        for (int i = 0; i < 100; i++) {
            if (scanner.hasNextLong()) {
                sum += scanner.nextLong();
            }
        }

        System.out.println(sum);
    }
}