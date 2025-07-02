import java.util.Scanner;

public class q6fibonaccirec {

    static long ops = 0;

    static long fib(int n) {
        ops++;
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 告知使用者輸入
        System.out.print("請輸入 n (<=40): ");
        int n = sc.nextInt();

        ops = 0;
        long fn = fib(n);

        // 輸出結果
        System.out.println("F(" + n + ") = " + fn);
        System.out.println("操作次數: " + ops);
        
        sc.close();
    }
}