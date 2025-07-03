import java.util.Scanner;

public class MixedCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        int intNum = Integer.parseInt(input[0]);
        double doubleNum = Double.parseDouble(input[1]);
        
        double result = intNum + doubleNum;
        System.out.printf("%.2f", result);
        
        scanner.close();
    }
}