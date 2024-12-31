public class Main {
  public static void main(String[] args) {
    String sex = "male";
    String serc = "Man ";
    String addString = sex.concat(serc);
    int age = 3 * 5;
    age = 24;
    int a, b, c;
    a = b = c = 87;
    int x = 4, y = 8, z = 9;
    double age2 = age;
    int randomNum = (int)(Math.random() * 101); 
    System.out.println(x + y + z);
    System.out.println(a+ b + c);
    System.out.println("Hello XXX");
    System.out.println("Hello aaa");
    System.out.println("It\'s alright! oder \\ nicht?");
    System.out.println("Call me \"Madhaus\".");
    System.out.println(age2 + " " +  sex + addString);
    System.out.println((int) Math.sqrt(16));
    System.out.println((int) randomNum);

    System.out.println("Comparing " + a + " and " + x);
    if (a > x) System.out.println(a + " is greater");
    else if (age < x) System.out.println(x + " is greater");
    else
      System.out.println(x + " is greater");
     
    String res = (age > z) ? "young" : "old ";
    System.out.println(res);
  }
}