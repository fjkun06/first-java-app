public class AllShapes {
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
    int numberOfTimes = 11;
    int halfLife = numberOfTimes / 2;

    for (int i = 0; i < numberOfTimes; i++) {
      if (i <= halfLife) {
        for (int j = 0; j <= i; j++) {
          colorPrinter("red", " X ");
        }
        for (int j = 0; j <= (2*halfLife - i)*2; j++) {
          colorPrinter("red", "   ");
        }
        for (int j = 0; j <= i; j++) {
          colorPrinter("blue", " O ");
        }
      }
      
          if (i > halfLife) {
            for (int j = 1; j <= numberOfTimes - i; j++) {
              colorPrinter("blue", " X ");
            }
         for (int j = 0; j <= i*2; j++) {
          colorPrinter("red", "   ");
        }
      for (int j = 1; j <= numberOfTimes - i; j++) {
      colorPrinter("red", " O ");
        }
      }
      
      System.out.println("\n");
    }
          
  }
}
