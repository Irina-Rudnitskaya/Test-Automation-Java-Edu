package test.aqa.pck;

public class Main {
   public static void main(String[] args) {
      hello("world");
      hello("user");
      hello("Irina");

      Square s = new Square(5);
      System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

      Rectangle r = new Rectangle(4,6);
      System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.rArea());
   }
   public static void hello (String somebody) {
      System.out.println("Hello " + somebody + "!");
   }
}