public class ds_07 {
    public static void main(String[] args) {
        // 創建3x3的二維陣列
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("3x3 二維陣列的所有元素:");
        System.out.println("========================");
        
        // 使用雙重for迴圈輸出所有元素
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println(); // 換行
        }
        
        System.out.println("\n詳細顯示每個元素的索引:");
        System.out.println("=============================");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("matrix[%d][%d] = %d\n", i, j, matrix[i][j]);
            }
        }
        
        // 計算總和
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        
        System.out.println("\n二維陣列所有元素的總和: " + sum);
        
        // 計算對角線元素的和
        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i]; // 主對角線
        }
        
        System.out.println("主對角線元素的總和: " + diagonalSum);
    }
}