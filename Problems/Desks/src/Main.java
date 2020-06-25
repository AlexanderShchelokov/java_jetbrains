import java.util.Scanner;

class Main {
    public static int getCountParts(int num) {
        if (num % 2 != 0) {
            return ((num / 2) + 1);
        }
        return num / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(getCountParts(a) + getCountParts(b) + getCountParts(c));
    }
}