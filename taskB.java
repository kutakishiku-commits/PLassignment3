import java.util.Scanner;

public class taskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int rem = (a % d + d) % d;
        int start = a + (c - rem + d) % d;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= b; i += d) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(i);
        }

        System.out.println(sb.toString());
    }
}