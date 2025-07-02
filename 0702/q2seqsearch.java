import java.util.Scanner;

public class q2seqsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 告知使用者輸入陣列大小
        System.out.print("請輸入陣列大小 n: ");
        int n = scanner.nextInt();
        
        // 讀取陣列
        int[] arr = new int[n];
        System.out.print("請輸入 " + n + " 個整數(要加空格): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 讀取要搜尋的 key
        System.out.print("請輸入要搜尋的數值 key: ");
        int key = scanner.nextInt();
        
        // 順序搜尋
        boolean found = false;
        int ops = 0;
        
        for (int i = 0; i < n; i++) {
            ops++; // 每次比較算一次操作
            if (arr[i] == key) {
                found = true;
                break; // 找到就停止搜尋
            }
        }
        
        // 輸出結果
        if (found) {
            System.out.println("搜尋結果: Yes");
        } else {
            System.out.println("搜尋結果: No");
        }
        System.out.println("操作次數: " + ops);
        
        scanner.close();
    }
}

