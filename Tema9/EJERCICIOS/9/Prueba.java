public class Prueba {
public static void main(String[] args) {
  
  Movil m1 = new Movil("678 11 22 33", "rata");
Movil m2 = new Movil("644 74 44 69", "mono");
Movil m3 = new Movil("622 32 89 09", "bisonte");




m1.llamar(m3,520);
m2.llamar(m1,550);
m3.llamar(m1,40);


System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
  //fin
}
}
