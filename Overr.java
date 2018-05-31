class Overr {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Overr {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Overr();
      Animal b = new Dog(); 

      a.move();  
      b.move();     }
}

