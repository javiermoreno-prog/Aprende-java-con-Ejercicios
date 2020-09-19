import java.util.Scanner;
public class ej15 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("dime un caracter para la piramide: ");
 String c=s.next();
  
  System.out.println("dime la orientacion: ");
  String orientacion=s.next();
  
  switch(orientacion) {
    case "arriba":
    System.out.println("  "+  c + " ");
    System.out.println(" "+c+c+c+" ");
    System.out.println(  c+c+c+c+c);
    break;
    case "abajo":
     System.out.println(  c+c+c+c+c);
      System.out.println(" "+c+c+c+" ");
       System.out.println("  "+  c + " ");
       break;
       case "izquierda":
       System.out.println(" "+c);
       System.out.println(c+c);
       System.out.println(" "+c);
       break;
       case "derecha":
       System.out.println(c+" ");
       System.out.println(c+c);
       System.out.println(c+" ");
       break;
       default: 
     }
   }
 }
