import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
        // 定義陣列
        int[] s = {1, 3, 5, 7, 9};
        
        // 建立Scanner物件用於輸入
        Scanner scanner = new Scanner(System.in);
        
        // 要求使用者輸入搜尋的數字
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();
        
        // 記錄是否找到
        boolean found = false;
        
        // 線性搜尋並追蹤比對過程
        for (int i = 0; i < s.length; i++) {
            // 顯示比對過程
            System.out.println("比對中：" + target + " vs " + s[i]);
            
            // 檢查是否找到目標
            if (s[i] == target) {
                found = true;
                break; // 找到後立即跳出迴圈
            }
        }
        
        // 輸出搜尋結果
        if (found) {
            System.out.println("結果：找到");
        } else {
            System.out.println("結果：找不到");
        }
        
        // 關閉Scanner
        scanner.close();
    }
}