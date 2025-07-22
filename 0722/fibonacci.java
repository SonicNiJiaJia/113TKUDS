public class fibonacci {
    
    // 計算費波納契數列的第n項
    public static int fibonacci(int n) {
        // 停止條件：F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
        // 遞迴關係：F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println("=== 費波納契數列測試 ===");
        System.out.println("F(0) = " + fibonacci(0));   
        System.out.println("F(1) = " + fibonacci(1));
        System.out.println("F(2) = " + fibonacci(2));   
        System.out.println("F(3) = " + fibonacci(3));   
        System.out.println("F(4) = " + fibonacci(4));   
        System.out.println("F(5) = " + fibonacci(5));   
        System.out.println("F(6) = " + fibonacci(6));   
        System.out.println("F(7) = " + fibonacci(7));   
        System.out.println("F(8) = " + fibonacci(8));   
        System.out.println("F(10) = " + fibonacci(10)); 
        
        System.out.println("\n前10項費波納契數列:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}