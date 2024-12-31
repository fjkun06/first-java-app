public class MatrixElementWise {
      public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8, 9},
            {10, 11, 12}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];
   if (rows != B.length || cols != B[0].length) {
            System.out.println("Matrices must have the same dimensions for addition!");
            return;
        }

        // Element-wise addition
for (int i = 0; i < rows; i++) {
  for (int j = 0; j < cols; j++) {
    C[i][j] = A[i][j] + B[i][j];
  }
}
for (int i = 0; i < rows; i++) {
  for (int j = 0; j < cols; j++) {
    System.out.print(C[i][j] + " ");
  }
  System.out.println("");
}
        // Print result matrix
    }
}
