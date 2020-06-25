import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int firstIndex = scanner.nextInt();
        int secondIntex = scanner.nextInt();
        for (int i = firstIndex; i <= secondIntex; i++) {
            System.out.print(str.charAt(i));
        }
    }
}