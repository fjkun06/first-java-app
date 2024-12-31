public class TransposeMatrix {
     public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = A.length;
        int cols = A[0].length;
        int[][] T = new int[cols][rows];

        // Transpose logic
for (int i = 0; i < cols; i++) {
  for (int j = 0; j < rows; j++) {
    T[i][j] = A[j][i];
  }
}
for (int i = 0; i < cols; i++) {
  for (int j = 0; j < rows; j++) {
    System.out.print(T[i][j] + " ");
  }
  System.out.println("");

}
        // Print transposed matrix
        System.out.println("Transposed Matrix:");
    } 
}
