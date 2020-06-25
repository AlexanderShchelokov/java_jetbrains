import java.util.Scanner;
import java.util.StringJoiner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        for (int i = 0; i < 4; i++) {
            int num = scanner.nextInt();
            num--;
            result = result + " " + Integer.toString(num);
        }
        System.out.println(result);
    }
}