public class TrianglePattern {

     static void colorPrinter(String color){
      switch (color) {
        case "red":
          System.out.print("\u001B[31m*\u001B[0m");
          break;
        case "blue":
          System.out.print("\u001B[34m*\u001B[0m");
                    break;
                        default:
          System.out.print("*");
                  break;
      }
    }
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
    System.out.println("x x x");
    System.out.println("no newline::::");
    System.out.println("shuuuuu");

    int numOfTimes = 10;
    int halfLife = numOfTimes / 2;
    System.out.println("\n");
      
    for (int i = 0; i < numOfTimes; i++) {
    
      if (i <= 4) {
             for (int j = halfLife; j > i; j--) {
               if (i != 4)
                 System.out.print("*");
       else colorPrinter("red");
      }
       for (int j = 1; j < (halfLife + i)*2; j++) {
        System.out.print(" ");
      }
              for (int j = halfLife; j > i; j--) {
         if (i != 4)
                 System.out.print("*");
       else colorPrinter("red");
      }
      System.out.println("\n");
      }

      else {
        for (int j = 0; j <= i - halfLife; j++) {
             if (i != 5)
                 System.out.print("*");
               else
                 colorPrinter("blue","*");
      }
       for (int j = 1; j < (3*halfLife - (i + 1))*2; j++) {
        System.out.print(" ");
      }
          for (int j = 0; j <= i - halfLife; j++) {
         if (i != 5)
                 System.out.print("*");
               else
                 colorPrinter("blue","*");
      }
      System.out.println("\n");
      }
    }

  }
}
