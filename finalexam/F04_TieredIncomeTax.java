import java.util.Scanner;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] incomes = new int[n];
        int totalTax = 0;
        
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
            int tax = calculateTax(incomes[i]);
            System.out.println("Tax: $" + tax);
            totalTax += tax;
        }
        
        int averageTax = totalTax / n;
        System.out.println("Average: $" + averageTax);
        
        scanner.close();
    }
    
    private static int calculateTax(int income) {
        int tax = 0;
        
        // 第1級距(5%)
        if (income <= 630000) {
            tax = (int)(income * 0.05);
        }
        // 第2級距 (12%)
        else if (income <= 1410000) {
            tax = (int)(630000 * 0.05 + (income - 630000) * 0.12);
        }
        // 第3級距 (20%)
        else if (income <= 2820000) {
            tax = (int)(630000 * 0.05 + 780000 * 0.12 + (income - 1410000) * 0.20);
        }
        // 第4級距 (30%)
        else if (income <= 4520000) {
            tax = (int)(630000 * 0.05 + 780000 * 0.12 + 1410000 * 0.20 + (income - 2820000) * 0.30);
        }
        // 第5級距(40%)
        else {
            tax = (int)(630000 * 0.05 + 780000 * 0.12 + 1410000 * 0.20 + 1700000 * 0.30 + (income - 4520000) * 0.40);
        }
        
        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：程式需要讀取n筆年收入資料，並對每筆收入進行一次稅額計算。
 *       每次稅額計算都是常數時間操作（段階稅率查表），
 *       因此總時間複雜度為線性O(n)，其中n為輸入的收入筆數。
 */