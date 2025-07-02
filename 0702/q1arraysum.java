import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 告知使用者輸入陣列大小
        System.out.print("請輸入陣列大小 n: ");
        int n = scanner.nextInt();
        
        // 告知使用者輸入陣列元素
        System.out.print("請輸入 " + n + " 個整數(要加空格): ");
        
        // 初始化總和與操作次數
        int sum = 0;
        int ops = 0;
        
        // 讀取 n 個整數並計算總和
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
            ops++; // 每次加法算一次操作
        }
        
        // 輸出結果
        System.out.println("陣列總和: " + sum);
        System.out.println("操作次數: " + ops);
        
        scanner.close();
    }
}