class Inh {
   int z;
	  public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum :"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference :"+z);
   }
}

public class My_Calculation extends Inh {
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product :"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}