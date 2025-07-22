public class fibonacciSlow {
    
    // 標準遞迴版本 - 效率很差
    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }
    // 時間複雜度：O(2^n) - 指數級成長！
    // 空間複雜度：O(n) - 遞迴深度
    
    // 記憶化版本 - 效率很好
    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }
    // 時間複雜度：O(n) - 每個數字只計算一次
    // 空間複雜度：O(n) - 儲存計算結果
    
    // 計算函數呼叫次數的版本（用於分析效率）
    private static int callCount = 0;
    
    public static int fibonacciSlowWithCount(int n) {
        callCount++;
        if (n <= 1) return n;
        return fibonacciSlowWithCount(n - 1) + fibonacciSlowWithCount(n - 2);
    }
    
    // 記憶化版本計算呼叫次數
    private static int callCountMemo = 0;
    
    public static int fibonacciFastWithCount(int n, int[] memo) {
        callCountMemo++;
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFastWithCount(n - 1, memo) + fibonacciFastWithCount(n - 2, memo);
        return memo[n];
    }
    
    // 測量執行時間的輔助方法
    public static void measureTime(String method, Runnable task) {
        long startTime = System.nanoTime();
        task.run();
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // 轉換為毫秒
        System.out.printf("%s 執行時間: %.3f 毫秒\n", method, duration);
    }
    
    public static void main(String[] args) {
        System.out.println("=== 費波納契數列複雜度比較 ===\n");
        
        // 比較小數字的結果
        System.out.println("小數字測試 (n=10):");
        int n = 10;
        
        callCount = 0;
        int resultSlow = fibonacciSlowWithCount(n);
        System.out.println("標準遞迴結果: F(" + n + ") = " + resultSlow + "，函數呼叫次數: " + callCount);
        
        callCountMemo = 0;
        int[] memo = new int[n + 1];
        int resultFast = fibonacciFastWithCount(n, memo);
        System.out.println("記憶化結果: F(" + n + ") = " + resultFast + "，函數呼叫次數: " + callCountMemo);
        
        System.out.println("\n效率差異: " + (callCount / (double)callCountMemo) + " 倍\n");
        
        // 執行時間比較
        System.out.println("執行時間比較:");
        
        // 測試較大的數字
        int testN = 35;
        System.out.println("計算 F(" + testN + "):");
        
        measureTime("標準遞迴", () -> {
            int result = fibonacciSlow(testN);
            System.out.println("結果: " + result);
        });
        
        measureTime("記憶化版本", () -> {
            int[] memoArray = new int[testN + 1];
            int result = fibonacciFast(testN, memoArray);
            System.out.println("結果: " + result);
        });
        
        // 顯示複雜度分析
        System.out.println("\n=== 複雜度分析 ===");
        System.out.println("標準遞迴版本:");
        System.out.println("   時間複雜度: O(2^n) - 指數級成長");
        System.out.println("   空間複雜度: O(n) - 遞迴深度");
        System.out.println("   問題: 重複計算相同的子問題");
        
        System.out.println("\n記憶化版本:");
        System.out.println("   時間複雜度: O(n) - 每個數字只計算一次");
        System.out.println("   空間複雜度: O(n) - 儲存計算結果");
        System.out.println("   優點: 避免重複計算，大幅提升效率");
        
        // 呼叫次數比較表
        System.out.println("\n=== 不同 n 值的函數呼叫次數比較 ===");
        System.out.printf("%-5s %-12s %-12s %-8s\n", "n", "標準遞迴", "記憶化", "效率比");
        System.out.println("----------------------------------------");
        
        for (int i = 5; i <= 20; i += 5) {
            callCount = 0;
            callCountMemo = 0;
            
            fibonacciSlowWithCount(i);
            int[] tempMemo = new int[i + 1];
            fibonacciFastWithCount(i, tempMemo);
            
            double ratio = callCount / (double)callCountMemo;
            System.out.printf("%-5d %-12d %-12d %.1fx\n", i, callCount, callCountMemo, ratio);
        }
    }
}