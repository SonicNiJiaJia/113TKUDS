public class matrix_multiplication_trace {
    public static void main(String[] args) {
        // 定義兩個2x2矩陣
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        // 建立結果矩陣
        int[][] c = new int[2][2];
        
        System.out.println("=== 矩陣乘法逐步計算 ===");
        System.out.println();
        
        // 顯示原始矩陣
        System.out.println("矩陣 A:");
        printMatrix(a);
        System.out.println();
        
        System.out.println("矩陣 B:");
        printMatrix(b);
        System.out.println();
        
        System.out.println("計算過程:");
        
        // 三層迴圈實作矩陣乘法
        for (int i = 0; i < 2; i++) {           // 列 (row)
            for (int j = 0; j < 2; j++) {       // 行 (column)
                
                // 開始計算 c[i][j] 位置的值
                System.out.print("計算位置 c[" + i + "][" + j + "]：");
                
                // 收集乘法項目和結果用於顯示
                StringBuilder calculation = new StringBuilder();
                StringBuilder sum = new StringBuilder();
                int result = 0;
                
                for (int k = 0; k < 2; k++) {   // 內積計算
                    int product = a[i][k] * b[k][j];
                    result += product;
                    
                    // 建立顯示字串
                    if (k > 0) {
                        calculation.append(" + ");
                        sum.append(" + ");
                    }
                    calculation.append(a[i][k]).append("*").append(b[k][j]);
                    sum.append(product);
                }
                
                // 顯示完整計算過程
                System.out.println(calculation.toString() + " = " + sum.toString() + " = " + result);
                
                // 將結果存入矩陣
                c[i][j] = result;
            }
        }
        
        System.out.println();
        System.out.println("結果矩陣：");
        printMatrix(c);
        
        
        /*
         * 時間複雜度分析：O(n³)
         * 
         * 此演算法使用三層巢狀迴圈：
         * - 外層迴圈 i：執行 n 次（對於2x2矩陣，n=2）
         * - 中層迴圈 j：執行 n 次（對於2x2矩陣，n=2）
         * - 內層迴圈 k：執行 n 次（對於2x2矩陣，n=2）
         * 
         * 總執行次數：n × n × n = n³
         * 對於2x2矩陣：2³ = 8次基本運算
         * 
         * 因此標準矩陣乘法的時間複雜度為 O(n³)
         * 當矩陣大小增加時，計算時間會以立方級數增長
         */
    }
    
    // 輔助方法：印出矩陣
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}