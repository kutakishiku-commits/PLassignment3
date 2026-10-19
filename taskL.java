import java.util.Scanner;

public class taskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String binaryStr = scanner.next();
            int decimal = Integer.parseInt(binaryStr, 2);

            System.out.println(decimal);
        }
    }
}