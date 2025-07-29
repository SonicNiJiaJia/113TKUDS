import java.util.Scanner;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int gcd = calculateGCD(a, b);
        int lcm = (a * b) / gcd;
        
        System.out.println("LCM: " + lcm);
        
        scanner.close();
    }
    
    private static int calculateGCD(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            return calculateGCD(a - b, b);
        } else {
            return calculateGCD(a, b - a);
        }
    }
}

/*
 * Time Complexity: O(max(a,b))
 * 說明：使用輾轉相減法遞迴求最大公約數，每次遞迴呼叫會將較大的數減去較小的數，
 *       在最壞情況下（如兩數相差1），需要進行max(a,b)次減法操作，
 *       因此時間複雜度為O(max(a,b))。
 */