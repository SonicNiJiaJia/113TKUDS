public class array_mode_count {
    public static void main(String[] args) {
        // 定義陣列
        int[] arr = {3, 7, 3, 1, 1, 1};
        
        System.out.println("陣列內容：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        
        // 用來記錄眾數和最大出現次數
        int mode = arr[0];          // 眾數
        int maxCount = 0;           // 最大出現次數
        
        // 外層迴圈：遍歷每個元素
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            int count = 0;
            
            // 內層迴圈：計算當前元素在整個陣列中的出現次數
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == currentElement) {
                    count++;
                }
            }
            
            // 顯示比對過程
            System.out.println("比對中：" + currentElement + " 出現次數 = " + count);
            
            // 更新眾數和最大出現次數
            if (count > maxCount) {
                maxCount = count;
                mode = currentElement;
            }
        }
        
        System.out.println();
        System.out.println("眾數為：" + mode + "，出現 " + maxCount + " 次");
        
        /*
         * 時間複雜度分析：O(n²)
         * 
         * 此演算法使用兩層巢狀迴圈：
         * - 外層迴圈：遍歷陣列中的每個元素，執行 n 次
         * - 內層迴圈：對每個元素計算其在整個陣列中的出現次數，執行 n 次
         * 
         * 總執行次數：n × n = n²
         * 因此時間複雜度為 O(n²)
         * 
         * 是否可改善？
         * 可以！使用以下方法可以改善到 O(n)：
         * 1. 使用 HashMap/Map 儲存每個元素的出現次數 - O(n)
         * 2. 先排序陣列，再用一次遍歷計算 - O(n log n)
         * 3. 使用陣列作為計數器（當數值範圍已知且較小時）- O(n)
         * 
         * 但根據題目要求不可使用 Map，所以此 O(n²) 解法是在限制條件下的合理選擇
         */
    }
}

