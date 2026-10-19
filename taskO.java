import java.util.Scanner;

public class taskO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num == 0) {
                    hasZero = true;
                    break;
                }
            }
        }
        if (hasZero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}