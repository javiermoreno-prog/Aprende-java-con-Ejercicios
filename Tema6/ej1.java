import java.util.Scanner;
public class ej1 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  System.out.print("PRIMER DADO: ");
  int primero=(int)((Math.random()*8)+1);
  System.out.print("SEGUNDO DADO: ");
  int segundo=(int)((Math.random()*8)+1);
  System.out.print("TERCER DADO: ");
  int tercero=(int)((Math.random()*8)+1);
  int suma=(primero+segundo+tercero);
  
  System.out.println();
  System.out.println(primero);
  System.out.println(segundo);
  System.out.println(tercero);
  System.out.println(suma);
}
}

