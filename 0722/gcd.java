public class gcd {
    
    // 實作歐幾里德演算法，使用遞迴計算兩個數的最大公因數
    public static int gcd(int a, int b) {
        // 停止條件：當 b 為 0 時，a 就是最大公因數
        if (b == 0) {
            return a;
        }
        // 遞迴關係：gcd(a, b) = gcd(b, a % b)
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        System.out.println("=== 最大公因數測試 ===");
        System.out.println("gcd(48, 18) = " + gcd(48, 18)); // 6
        System.out.println("gcd(100, 25) = " + gcd(100, 25)); // 25
        System.out.println("gcd(17, 13) = " + gcd(17, 13)); // 1
        System.out.println("gcd(56, 42) = " + gcd(56, 42)); // 14
    }
}