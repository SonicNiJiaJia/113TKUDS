import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("請輸入 3 個正整數：");
        for (int i = 0; i < 3; i++) {
            System.out.print("輸入第 " + (i + 1) + " 個數字: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n各位數總和與計算過程：");
        for (int n : numbers) {
            printDigitSum(n);
        }

        scanner.close();
    }

    public static void printDigitSum(int n) {
        StringBuilder process = new StringBuilder();
        int sum = 0;
        String numStr = Integer.toString(n);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            sum += digit;
            process.append(digit);
            if (i < numStr.length() - 1) {
                process.append(" + ");
            }
        }

        process.append(" = ").append(sum);
        System.out.println(process);
    }
}
