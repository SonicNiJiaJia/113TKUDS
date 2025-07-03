import java.util.Scanner;

public class TempConverter {
    
    public static int celsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int celsius = scanner.nextInt();
        int fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit);
        
        scanner.close();
    }
}