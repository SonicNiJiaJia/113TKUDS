public class ds_05 {
    public static void main(String[] args) {
        // 創建包含10個整數的一維陣列
        int[] numbers = {12, 25, 8, 36, 47, 19, 63, 84, 5, 72};
        
        System.out.println("陣列中的所有元素:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("陣列[%d] = %d\n", i, numbers[i]);
        }
        
        // 計算總和
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("\n陣列所有元素的總和為: " + sum);
    
    }
}