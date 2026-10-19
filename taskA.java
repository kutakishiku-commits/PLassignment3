import java.util.Scanner;

public class taskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 2 != 0) {
            a++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= b; i += 2) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}