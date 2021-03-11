public class Prueba {
  public static void main(String[] args) {
  TarjetaRegalo n=new TarjetaRegalo(12);
  TarjetaRegalo a=new TarjetaRegalo(21);
  
  System.out.println(n);
  System.out.println(a);
  n.gastar(5);
  a.gastar(1);
  System.out.println(n);
  System.out.println(a);
  TarjetaRegalo c=n.fusionar(a);
  System.out.println(c);
  System.out.println(n);
  System.out.println(a);
//fin
}
}  
