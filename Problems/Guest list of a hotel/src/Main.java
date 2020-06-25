import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String guests[] = new String[8];
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i <= 7) {
            guests[i] = scanner.next();
            i++;
        }
        while (i > 0) {
            i--;
            System.out.println(guests[i]);
        }
    }
}