import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int num = 0;
        do {
            num = scanner.nextInt();
            if (num > maxNum) {
                maxNum = num;
            }
        } while (num != 0);
        System.out.println(maxNum);
    }
}