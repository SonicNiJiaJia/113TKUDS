import java.util.Random;

public class ds_06 {
    public static void main(String[] args) {
        // 創建包含10個隨機整數的一維陣列
        int[] numbers = new int[10];
        Random random = new Random();
        
        // 生成隨機數 (範圍: 1-100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        
        System.out.println("隨機生成的陣列元素:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("陣列[%d] = %d\n", i, numbers[i]);
        }
        
        // 找出最大值
        int max = numbers[0];
        int maxIndex = 0;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        
        System.out.println("\n最大值為: " + max);
        System.out.println("最大值位於索引: " + maxIndex);
        
        // 額外顯示最小值
        int min = numbers[0];
        int minIndex = 0;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        
        System.out.println("\n最小值為: " + min);
        System.out.println("最小值位於索引: " + minIndex);
    }
}