import java.util.Scanner;
public class kdise {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  

 System.out.println("Dime la altura de la piramide: ");
 int altura=s.nextInt();
 if(altura<=3) {
   System.out.print("Incorrecto.Indica la altura: ");
   altura=s.nextInt();
 }
 System.out.println("Dime el margen: ");
 int margen=s.nextInt();
 if(margen<=1) {
   System.out.print("Incorrecto.Indica el margen: ");
   margen=s.nextInt();
 }

 int copia=margen;
 int planta=1;
 int espacios=altura-1;
 
 int interno=1;
 int linea=1;
 
 while(planta<=altura) {
   //pinto espacios
   for(int i=1;i<=espacios;i++) {
     System.out.print(" ");
   }
   //compruebo si planta=margen
   if((planta>=margen+1) && (planta<=altura-margen)) {
     //pinto caracteres(primer margen)
     for(int i=1;i<=copia;i++) {
       System.out.print("*");
     }
     //pinto espacios internos de la piramide
     for(int i=1;i<=interno;i++) {
       System.out.print(" ");
     }
     //pinto caracteres(segundo margen)
     for(int i=1;i<=copia;i++) {
       System.out.print("*");
     }
     System.out.println();
     interno+=2;
     linea+=2;
     planta++;
     espacios--;
   } else {
     for(int i=0;i<linea;i++) {
       System.out.print("*");
     }
     System.out.println();
     linea+=2;
     planta++;
     espacios--;
   }
   
 }
}
}

  
     
