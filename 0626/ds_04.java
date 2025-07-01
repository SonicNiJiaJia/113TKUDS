public class ds_04 {
    public static void main(String[] args) {
        // 創建包含5個整數的一維陣列
        int[] numbers = {10, 25, 37, 42, 58};
        
        System.out.println("陣列中的所有元素:");
        
        // 使用for迴圈輸出所有元素
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("陣列[%d] = %d\n", i, numbers[i]);
        }
        
        
    }
}