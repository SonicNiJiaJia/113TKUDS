import java.util.Scanner;

public class TicTacToe5x5 {
    private static final int SIZE = 5;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        initializeBoard(); // O(1)
        
        System.out.println("=== 5x5 井字遊戲 ===");
        System.out.println();
        
        while (true) { // O(n)
            printBoard(); // O(1)
            
            int[] position = getValidInput(); // O(1)
            int row = position[0];
            int col = position[1];
            
            board[row][col] = currentPlayer; // O(1)
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");
            System.out.println();
            
            if (checkWin(row, col)) { // O(1)
                printBoard(); // O(1)
                System.out.println("玩家 " + currentPlayer + " 獲勝！");
                break;
            }
            
            if (isBoardFull()) { // O(1)
                printBoard(); // O(1)
                System.out.println("平手！");
                break;
            }
            
            switchPlayer(); // O(1)
        }
        
        scanner.close();
    }
    
    // 初始化棋盤
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) { // O(1)
            for (int j = 0; j < SIZE; j++) { // O(1)
                board[i][j] = '.';
            }
        }
    }
    
    // 列印棋盤
    private static void printBoard() {
        System.out.print("  ");
        for (int j = 0; j < SIZE; j++) { // O(1)
            System.out.print(j + " ");
        }
        System.out.println();
        
        for (int i = 0; i < SIZE; i++) { // O(1)
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) { // O(1)
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // 取得有效輸入
    private static int[] getValidInput() {
        while (true) { // O(1)
            try {
                System.out.print("玩家 " + currentPlayer + " 請輸入位置 (row col): ");
                int row = scanner.nextInt(); // O(1)
                int col = scanner.nextInt(); // O(1)
                
                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) { // O(1)
                    System.out.println("錯誤：座標超出範圍，請重新輸入！");
                    continue;
                }
                
                if (board[row][col] != '.') { // O(1)
                    System.out.println("錯誤：該位置已被佔用，請重新輸入！");
                    continue;
                }
                
                return new int[]{row, col};
            } catch (Exception e) {
                System.out.println("錯誤：請輸入有效的數字！");
                scanner.nextLine(); // 清除輸入緩衝區
            }
        }
    }
    
    // 檢查是否獲勝
    private static boolean checkWin(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkMainDiagonal() || checkAntiDiagonal(); // O(1)
    }
    
    // 檢查行
    private static boolean checkRow(int row) {
        for (int j = 0; j < SIZE; j++) { // O(1)
            if (board[row][j] != currentPlayer) {
                return false;
            }
        }
        return true;
    }
    
    // 檢查列
    private static boolean checkColumn(int col) {
        for (int i = 0; i < SIZE; i++) { // O(1)
            if (board[i][col] != currentPlayer) {
                return false;
            }
        }
        return true;
    }
    
    // 檢查主對角線
    private static boolean checkMainDiagonal() {
        for (int i = 0; i < SIZE; i++) { // O(1)
            if (board[i][i] != currentPlayer) {
                return false;
            }
        }
        return true;
    }
    
    // 檢查反對角線
    private static boolean checkAntiDiagonal() {
        for (int i = 0; i < SIZE; i++) { // O(1)
            if (board[i][SIZE - 1 - i] != currentPlayer) {
                return false;
            }
        }
        return true;
    }
    
    // 檢查棋盤是否已滿
    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) { // O(1)
            for (int j = 0; j < SIZE; j++) { // O(1)
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
    
    // 切換玩家
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // O(1)
    }
}