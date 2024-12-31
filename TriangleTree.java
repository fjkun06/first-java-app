public class TriangleTree {

  static void colorPrinter(String color, String text) {
    switch (color) {
      case "red":
        System.out.print("\u001B[31m" + text + "\u001B[0m");
        break;
      case "blue":
        System.out.print("\u001B[34m" + text + "\u001B[0m");
        break;

      default:
        System.out.print(text);

        break;
    }
  }
    
  static void trianglePrinter(int quantity) {
    int triangleSize = quantity;
         for (int i = 0; i < triangleSize; i++) {
boolean complete = false;
for (int j = 0; j < 1; j++) {
  System.out.print("  ");
  colorPrinter("red", "/");
  colorPrinter("red", "\\");
  System.out.print("  ");
  System.out.print("  ");

  if (i == triangleSize - 1) {
    complete = true;
  }
}
if (i == triangleSize - 1) {
    System.out.println("\n");
}    
if (complete) {
  for (int j = 0; j < triangleSize; j++) {
                    colorPrinter("red", "/");
        colorPrinter("red", " ");
        colorPrinter("red", "_");
        colorPrinter("red", "_");
        colorPrinter("red", " ");
        colorPrinter("red", "\\");
  System.out.print("  ");

           }
}
        
         
      //  for (int j = 0; j < 1; j++) {
      //     if (i == 0) {
      //    System.out.print("  ");
      // colorPrinter("red", "/");
      // colorPrinter("red", "\\");
      // System.out.print("  ");
        
      // } else {
      //   colorPrinter("red", "/");
      //   colorPrinter("red", " ");
      //   colorPrinter("red", "_");
      //   colorPrinter("red", "_");
      //   colorPrinter("red", " ");
      //   colorPrinter("red", "\\");
      // }
 
    }
       }

  

  public static void main(String[] args) {
    int triangleWidth = 6;
    int printHeight = 5;
    int halfHeight = 5;
    
    // trianglePrinter(5);

    for (int i = 1; i < printHeight; i++) {
    //   for (int j = 0; j < ((int) (((printHeight-i)/2 + 0.5)*2*triangleWidth)); j++) {
    // System.out.print(" ");
        
    //   }
    trianglePrinter(i);
    System.out.println("\n");
         }
  }
}
