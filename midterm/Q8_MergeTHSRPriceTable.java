import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        String[] station = new String[n];
        int[][] price = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            station[i] = parts[0];
            price[i][0] = Integer.parseInt(parts[1]);
            price[i][1] = Integer.parseInt(parts[2]);
        }
        
        System.out.println("Station|Standard|Business");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%s|%d|%d%n", station[i], price[i][0], price[i][1]);
        }
        
        scanner.close();
    }
}