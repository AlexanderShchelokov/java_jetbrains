import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        while (numStr.length() < 4) {
            numStr = "0" + numStr;
        }
        if (numStr.charAt(0) == numStr.charAt(3) && numStr.charAt(1) == numStr.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }

    }
}