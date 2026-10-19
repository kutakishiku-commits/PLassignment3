import java.util.Scanner;

public class taskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int x = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(i);
            }
        }

        System.out.println(sb.toString());
    }
}