package OOP.lesson14Task;

import java.security.PublicKey;

public class Class {
   private int san;
   private String soz;
   private int [] massiv;

   public Class (int a, String s, int [] m) {
      san = a;
      soz = s;
      massiv = m;
       System.out.print(a + "  " + s + " ");
       for (int arg: m) {
       System.out.print(arg + " ");

       }
   }
}
