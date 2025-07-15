import java.util.Scanner;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int totalBill = 0;
        
        for (int i = 0; i < n; i++) {
            int kWh = scanner.nextInt();
            int bill = calc(kWh);
            System.out.println("Bill: $" + bill);
            totalBill += bill;
        }
        
        int average = (int) Math.round((double) totalBill / n);
        
        System.out.println("Total: $" + totalBill);
        System.out.println("Average: $" + average);
        
        scanner.close();
    }
    
    private static int calc(int k) {
        double total = 0;
        
        if (k <= 120) {
            total += k * 1.68;
        } else if (k <= 330) {
            total += 120 * 1.68;
            total += (k - 120) * 2.45;
        } else if (k <= 500) {
            total += 120 * 1.68;
            total += 210 * 2.45;
            total += (k - 330) * 3.70;
        } else if (k <= 700) {
            total += 120 * 1.68;
            total += 210 * 2.45;
            total += 170 * 3.70;
            total += (k - 500) * 5.04;
        } else if (k <= 1000) {
            total += 120 * 1.68;
            total += 210 * 2.45;
            total += 170 * 3.70;
            total += 200 * 5.04;
            total += (k - 700) * 6.24;
        } else {
            total += 120 * 1.68;
            total += 210 * 2.45;
            total += 170 * 3.70;
            total += 200 * 5.04;
            total += 300 * 6.24;
            total += (k - 1000) * 8.46;
        }
        
        return (int) Math.round(total);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：程式需要處理 n 個電費帳單，每個帳單的計算時間為常數
 * 因此總時間複雜度為 O(n)
 */