import java.util.Scanner;

public class q3binsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 告知使用者輸入陣列大小
        System.out.print("請輸入已排序陣列大小 n: ");
        int n = scanner.nextInt();
        
        // 讀取已排序陣列
        int[] arr = new int[n];
        System.out.print("請輸入 " + n + " 個已排序的整數: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 讀取要搜尋的 key
        System.out.print("請輸入要搜尋的數值 key: ");
        int key = scanner.nextInt();
        
        // 二元搜尋
        int left = 0;
        int right = n - 1;
        int ops = 0;
        int result = -1;
        
        while (left <= right) {
            ops++; // 每次比較算一次操作
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // 輸出結果
        System.out.println("索引位置: " + result);
        System.out.println("操作次數: " + ops);
        
        scanner.close();
    }
}