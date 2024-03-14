
public class Staircase {

    static void printStars(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
          
        int rows = 4; // Number of rows in the staircase
            
        // Outer loop to handle number of rows
        for (int i = 1; i <= rows; i++) {
            
            // Print leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            printStars(i);
            
            // Move to next line
            System.out.println();
        }
    }   
}
