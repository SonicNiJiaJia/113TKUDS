import java.util.Scanner;

public class binary_search_trace {
    public static void main(String[] args) {
        // 定義已排序的陣列
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        
        System.out.println("=== 二元搜尋法比對過程 ===");
        System.out.println("陣列內容：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        
        // 使用try-with-resources自動管理Scanner資源
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("請輸入要搜尋的數字：");
            int target = scanner.nextInt();
            
            // 執行二元搜尋
            boolean found = binarySearch(arr, target);
            
            System.out.println();
            if (found) {
                System.out.println("結果：已找到！");
            } else {
                System.out.println("結果：找不到！");
            }
        }
        
        /*
         * 時間複雜度分析：O(log n)
         * 
         * 二元搜尋法與線性搜尋法的效率比較：
         * 
         * 二元搜尋法 (Binary Search)：
         * - 時間複雜度：O(log n)
         * - 每次比較都能排除一半的搜尋範圍
         * - 適用於已排序的陣列
         * - 對於大型陣列效率極高
         * 
         * 線性搜尋法 (Linear Search)：
         * - 時間複雜度：O(n)
         * - 需要逐一檢查每個元素
         * - 適用於任何陣列（不需排序）
         * - 對於小型陣列或未排序陣列較實用
         * 
         * 效率比較範例：
         * - 陣列長度 1000：線性搜尋最多需要 1000 次比較，二元搜尋最多需要 10 次
         * - 陣列長度 1,000,000：線性搜尋最多需要 1,000,000 次比較，二元搜尋最多需要 20 次
         * 
         * 因此在處理大型已排序陣列時，二元搜尋法的效率遠高於線性搜尋法
         */
    }
    
    // 二元搜尋方法
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;  // 避免整數溢位的寫法
            
            // 顯示目前的搜尋範圍和中位數
            System.out.println("搜尋範圍：left = " + left + ", right = " + right + 
                             ", mid = " + mid + " → arr[mid] = " + arr[mid]);
            
            // 找到目標值
            if (arr[mid] == target) {
                return true;
            }
            // 目標值在左半部
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            // 目標值在右半部
            else {
                left = mid + 1;
            }
        }
        
        return false;  // 沒找到
    }
}