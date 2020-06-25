import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        System.out.println((countCups >= 10 && countCups <= 20 && !isWeekend) || (countCups >= 15 && countCups <= 25 && isWeekend));
    }
}