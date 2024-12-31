public class ChristmasTree {
    static void colorPrinter(String color, String text){
      switch (color) {
        case "red":
          System.out.print("\u001B[31m"+text+"\u001B[0m");
          break;
        case "blue":
          System.out.print("\u001B[34m"+text+"\u001B[0m");
                    break;
      
                  default:
          System.out.print(text);
        
          break;
      }
    }
  public static void main(String[] args) {
    int numberOfTimes = 9;
    int halfLife = numberOfTimes / 2;

    colorPrinter("red", "\n\n\tChristmas ");
    colorPrinter("red", "Tree\n\n");


    for (int i = 0; i < numberOfTimes; i++) {
      if (i < 5 && i==0) {
        for (int j = 0; j < (halfLife - i) * 3; j++) {
          colorPrinter("red", "|");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
          System.out.print(" + ");
        }
        for (int j = 0; j < (halfLife - i) * 3; j++) {
          colorPrinter("blue", "|");
        }
      }
      
      else if (i < 5) {
        for (int j = 0; j < (halfLife - i) * 3; j++) {
          colorPrinter("red", "|");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
          System.out.print(" * ");
        }
        for (int j = 0; j < (halfLife - i) * 3; j++) {
          colorPrinter("blue", "|");
        }
      }
      
      if (i == 4) {
        for (int j = 0; j < 2; j++) {
if(j == 0)   System.out.println("\n");
          for (int j2 = 0; j2 < 2*3; j2++) {
            colorPrinter("red", "|");
          }
          for (int j2 = 0; j2 < 5; j2++) {
            System.out.print(" * ");
          }
          for (int j2 = 0; j2 < 2*3; j2++) {
            colorPrinter("blue", "|");
          }
          System.out.println("\n");
        }
        
      }
     
      System.out.println("\n");
      
    }
  }
}
