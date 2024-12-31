public class TrianglePattern {
  public static void main(String[] args) {
    System.out.println("x x x");
    System.out.println("no newline::::");
    System.out.println("shuuuuu");

    for (int i = 0; i < 4; i++) {
      System.out.println(i + ":+");
    }
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("\n");
    }

    int[] A = { 1, 2, 3 };
    int[] B = { 4, 5, 6 };
    int dotProduct = 0;
    for (int i = 0; i < A.length; i++) {
      dotProduct += A[i] * B[i];
    }

    System.out.println(dotProduct);
  }
}
