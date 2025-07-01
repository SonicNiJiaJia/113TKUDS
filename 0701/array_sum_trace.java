public class array_sum_trace {
    public static void main(String[] args) {
        // 定義陣列
        int[] arr = {1, 3, 5};
        
        // 初始化總和為0
        int total = 0;
        
        // 逐一加總並顯示過程
        for (int i = 0; i < arr.length; i++) {
            int oldTotal = total;  // 保存加總前的值
            total += arr[i];       // 執行加總
            
            // 顯示加總過程
            System.out.println("加總過程:total = " + oldTotal + " + " + arr[i] + " = " + total);
        }
        
        // 顯示最終結果
        System.out.println("總和為:" + total);
    }
}

//此演算法的時間複雜度為 O(n)，其中 n 是陣列的長度。
