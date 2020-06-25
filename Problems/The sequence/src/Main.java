import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        int count = scanner.nextInt();
        int i = 0;
        while (i < count) {
            int num = scanner.nextInt();
            i++;
            if (num > maxNum && num % 4 == 0) {
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}