public class Test {
   public void myAge() {
      int age = 0;
      age = age + 22;
      System.out.println("my age is : " + age);
   }

   public static void main(String args[]) {
      Test test = new Test();
      test.myAge();
   }
}