import java.util.Scanner;
public class ej1 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
 System.out.println("ESTE PROGRAMA PINTA UN GUSANO");
 System.out.println("Controles: ");
 int izquierda=0;
 int derecha=19;
 String control="";
 do {
 //pinta espacios
 for(int i=0;i<=izquierda;i++) {
   System.out.print(" ");
 }
 //pinta gusano
 System.out.print("*");
 //pinta espacios
 for(int i=1;i<=derecha;i++) {
   System.out.print(" ");
 }
 
 System.out.print("¿j,k,l,s?: ");
 control=s.next();
 
 switch(control) {
   case "j":
   izquierda++;
   derecha--;
   break;
  case "l":
   izquierda--;
   derecha++;
   break;
  case "k":
  izquierda=izquierda;
  derecha=derecha;
  break;
 default:
}
} while(!(control.equals("s")));

}
}
