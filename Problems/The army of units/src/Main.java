import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String result = "";
        if (count < 1) {
            result = "no army";
        } else if (count <= 19) {
            result = "pack";
        } else if (count <= 249 ) {
            result = "throng";
        } else if (count <= 999) {
            result = "zounds";
        } else {
            result = "legion";
        }
        System.out.println(result);
    }
}