public class StudentGradeSystem {
    // 學生分數陣列
    private int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
    
    // 根據分數判斷等級
    public char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }
    
    // 統計各等級人數
    public int[] getGradeCount() {
        int[] count = new int[4]; // A, B, C, D
        for (int score : scores) {
            char grade = getGrade(score);
            switch (grade) {
                case 'A': count[0]++; break;
                case 'B': count[1]++; break;
                case 'C': count[2]++; break;
                case 'D': count[3]++; break;
            }
        }
        return count;
    }
    
    // 找出最高分學生位置
    public int getHighestScoreIndex() {
        int maxIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    // 找出最低分學生位置
    public int getLowestScoreIndex() {
        int minIndex = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    // 計算平均分
    public double getAverageScore() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
    
    // 計算高於平均分的學生比例
    public double getAboveAverageRatio() {
        double average = getAverageScore();
        int count = 0;
        for (int score : scores) {
            if (score > average) {
                count++;
            }
        }
        return (double) count / scores.length * 100;
    }
    
    // 顯示完整成績報告
    public void showCompleteReport() {
        System.out.println("========================================");
        System.out.println("          學生成績分析報告");
        System.out.println("========================================");
        
        // 統計摘要
        System.out.println("\n📊 統計摘要：");
        System.out.println("----------------------------------------");
        
        double average = getAverageScore();
        int highestIndex = getHighestScoreIndex();
        int lowestIndex = getLowestScoreIndex();
        double aboveAverageRatio = getAboveAverageRatio();
        int[] gradeCount = getGradeCount();
        
        System.out.printf("總學生人數：%d 人\n", scores.length);
        System.out.printf("全班平均分：%.2f 分\n", average);
        System.out.printf("最高分：%d 分（學生編號 %d）\n", scores[highestIndex], highestIndex + 1);
        System.out.printf("最低分：%d 分（學生編號 %d）\n", scores[lowestIndex], lowestIndex + 1);
        System.out.printf("高於平均分學生比例：%.1f%%\n", aboveAverageRatio);
        
        System.out.println("\n📈 等級分布：");
        System.out.println("----------------------------------------");
        System.out.printf("A 級（90分以上）：%d 人\n", gradeCount[0]);
        System.out.printf("B 級（80-89分）：%d 人\n", gradeCount[1]);
        System.out.printf("C 級（70-79分）：%d 人\n", gradeCount[2]);
        System.out.printf("D 級（70分以下）：%d 人\n", gradeCount[3]);
        
        // 詳細列表
        System.out.println("\n📋 詳細成績列表：");
        System.out.println("----------------------------------------");
        System.out.println("編號\t分數\t等級\t備註");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(scores[i]);
            String note = "";
            
            if (i == highestIndex) {
                note = "🏆 最高分";
            } else if (i == lowestIndex) {
                note = "📉 最低分";
            } else if (scores[i] > average) {
                note = "📈 高於平均";
            } else {
                note = "📊 低於平均";
            }
            
            System.out.printf("%d\t%d\t%c\t%s\n", i + 1, scores[i], grade, note);
        }
        
        System.out.println("========================================");
    }
    
    public static void main(String[] args) {
        StudentGradeSystem system = new StudentGradeSystem();
        system.showCompleteReport();
        
        // 額外展示各項功能
        System.out.println("\n🔍 功能驗證：");
        System.out.println("----------------------------------------");
        
        // 測試個別功能
        System.out.println("各等級人數統計：");
        int[] counts = system.getGradeCount();
        System.out.printf("A級: %d人, B級: %d人, C級: %d人, D級: %d人\n", 
                         counts[0], counts[1], counts[2], counts[3]);
        
        System.out.printf("最高分學生位置：第 %d 位\n", system.getHighestScoreIndex() + 1);
        System.out.printf("最低分學生位置：第 %d 位\n", system.getLowestScoreIndex() + 1);
        System.out.printf("高於平均分比例：%.1f%%\n", system.getAboveAverageRatio());
    }
}