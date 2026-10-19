import java.util.Scanner;
public class taskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b < 0) {
            return;
        }
        int start = (a > 0) ? (int) Math.ceil(Math.sqrt(a)) : 0;
        StringBuilder sb = new StringBuilder();
        for (long i = start; i * i <= b; i++) {
            long square = i * i;
            if (square >= a) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(square);
            }
        }

        System.out.println(sb.toString());
    }
}