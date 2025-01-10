public class NestedIf {

  static void calculateAge(int age) {
   
    if (age < 30) {
        System.out.println("Student discunt applied beacause of age: " + age);
    }else{
        System.out.println("Senior discount applied beacause of age:" + age);
}
  }
  public static void main(String[] args) {
    int age = 20;

 calculateAge(age);
}}