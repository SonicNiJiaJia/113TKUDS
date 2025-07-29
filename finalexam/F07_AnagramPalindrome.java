import java.util.Scanner;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String processed = processString(input);
        
        int[] frequency = new int[26];
        calculateFrequency(processed, 0, frequency);
        
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (frequency[i] % 2 == 1) {
                oddCount++;
            }
        }
        
        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
        
        scanner.close();
    }
    
    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
    
    private static void calculateFrequency(String str, int index, int[] frequency) {
        if (index >= str.length()) {
            return;
        }
        
        frequency[str.charAt(index) - 'a']++;
        calculateFrequency(str, index + 1, frequency);
    }
}