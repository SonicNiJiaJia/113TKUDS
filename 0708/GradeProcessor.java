public class GradeProcessor {
    public static void main(String[] args) {
        // 1. 建立一個包含 8 位學生成績的陣列
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};
        
        // 2. 計算並輸出總分、平均分數（保留兩位小數）
        int totalScore = 0;
        for (int i = 0; i < grades.length; i++) {
            totalScore += grades[i];
        }
        double average = (double) totalScore / grades.length;
        
        System.out.println("總分: " + totalScore);
        System.out.printf("平均分數: %.2f\n", average);
        
        // 3. 找出最高分和最低分，並顯示它們的索引位置
        int maxScore = grades[0];
        int minScore = grades[0];
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxScore) {
                maxScore = grades[i];
                maxIndex = i;
            }
            if (grades[i] < minScore) {
                minScore = grades[i];
                minIndex = i;
            }
        }
        
        System.out.println("最高分: " + maxScore + " (索引位置: " + maxIndex + ")");
        System.out.println("最低分: " + minScore + " (索引位置: " + minIndex + ")");
        
        // 4. 計算有多少位學生的成績超過平均分
        int aboveAverageCount = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("超過平均分的學生人數: " + aboveAverageCount);
        
        // 5. 將所有成績按照「學生編號: 成績」的格式輸出
        System.out.println("\n學生成績明細:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生編號 " + (i + 1) + ": " + grades[i]);
        }
    }
}