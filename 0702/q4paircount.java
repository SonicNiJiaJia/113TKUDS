import java.util.Scanner;

public class q4paircount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 告知使用者輸入陣列大小
        System.out.print("請輸入陣列大小 n: ");
        int n = scanner.nextInt();
        
        // 讀取陣列
        int[] arr = new int[n];
        System.out.print("請輸入 " + n + " 個整數: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 計算成對數量 C(n,2) = n*(n-1)/2
        int pairCount = 0;
        int ops = 0;
        
        // 方法1: 使用雙層迴圈計算所有不同索引的配對
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairCount++;
                ops++; // 每次配對計算算一次操作
            }
        }
        
        // 輸出結果
        System.out.println("成對數量: " + pairCount);
        System.out.println("操作次數: " + ops);
        
        scanner.close();
    }
}