import java.util.Scanner;
public class ej29 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
 String comer=s.next();
 double precio=0;
 switch(comer) {
   case "palmera":
   precio=1.40;
   break;
   case "donut":
   precio=1;
   break;
   case "pitufo":
   System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
   String opcion=s.next();
   if(opcion.equals("aceite")) {
     precio=1.20;
   } else {
     precio=1.60;
   }
 }
 System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
 String beber=s.next();
 double precioBeber=0;
 if(beber.equals("cafe")) {
   precioBeber=1.20;
 } else {
   precioBeber=1.50;
 }
 System.out.println(comer + ": "+ precio);
 System.out.println(beber + ": "+precioBeber);
 System.out.println("Total desayuno: "+(precio+precioBeber));
}
}
