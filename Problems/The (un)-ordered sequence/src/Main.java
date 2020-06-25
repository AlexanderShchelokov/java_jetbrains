import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        boolean isPositive = false;
        int firstNum = scanner.nextInt();
        int num = scanner.nextInt();
        while (num == firstNum) {
            num = scanner.nextInt();
        }
        if (num > firstNum) {
            isPositive = true;
        }
        while (num != 0) {
            int nextNum = scanner.nextInt();
            if (nextNum == 0) {
                break;
            }
            if (isPositive && nextNum >= num) {
                num = nextNum;
                continue;
            } else if (!isPositive && nextNum <= num) {
                num = nextNum;
                continue;
            }
            result = false;
            break;
        }

        System.out.print(result);
    }
}