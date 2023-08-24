public class SpiralPattern {
    public static void main(String[] args) {
        int n = 5; // Ukuran spiral (baris dan kolom)
        char[][] spiral = new char[n][n];

        int value = 64; // ASCII value of '@' is 64

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (value < n * n-1) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                value++;
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                value++;
                spiral[i][right] = (char) value;
            }
            right--;

            // Traverse bottom row
            for (int i = right; i >= left; i--) {
                value++;
                spiral[bottom][i] = (char) value;
            }
            bottom--;

            // Traverse left column
            for (int i = bottom; i >= top; i--) {
                value++;
                spiral[i][left] = (char) value;
            }
            left++;
        }

        // Print the spiral pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + " ");
            }
            System.out.println();
        }
    }
}
