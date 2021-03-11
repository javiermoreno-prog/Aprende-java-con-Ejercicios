import java.util.Scanner;
public class Prueba {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   
   System.out.println("Dime cuantos discos quieres meter: ");
   int e=s.nextInt();
   
   Disco[] n=new Disco[e];
   for(int i=0;i<e;i++) {
     n[i]=new Disco();
   }
   boolean salir = false;
   int opcion=0;
   int relleno=0;
   String c;
   String a;
   String t;
   String g;
   int d;
   do {
     System.out.println("Que quieres hacer: ");
     System.out.println("1. Listado");
     System.out.println("2. Nuevo disco");
     System.out.println("3. Modificar");
     System.out.println("4. Borrar");
     System.out.println("5. Salir");
     System.out.print("Introduzca una opción: ");
     opcion=s.nextInt();
     
     switch(opcion) {
       case 1:
       for(int i=0;i<n.length;i++) {
         System.out.println(n[i]);
       }
       break;
       case 2:
       System.out.println("Dime codigo: ");
       c=s.next();
       System.out.println("Dime autor: ");
       a=s.next();
       System.out.println("Dime titulo: ");
       t=s.next();
       System.out.println("Dime genero: ");
       g=s.next();
       System.out.println("Dime duracion: ");
       d=s.nextInt();
       n[relleno]=new Disco(c,a,t,g,d);
         relleno++;
       break;
       case 3:
       System.out.println("Dime el disco que quieres cambiar: ");
       opcion=s.nextInt();
        System.out.println("Dime codigo: ");
       c=s.next();
       System.out.println("Dime autor: ");
       a=s.next();
       System.out.println("Dime titulo: ");
       t=s.next();
       System.out.println("Dime genero: ");
       g=s.next();
       System.out.println("Dime duracion: ");
       d=s.nextInt();
       n[opcion]=new Disco(c,a,t,g,d);
       break;
       case 4:
        System.out.println("Dime el disco que quieres borrar: ");
       opcion=s.nextInt();
       n[opcion]=new Disco();
       break;
       case 5:
       salir=true;
       break;
       default:
     }
       
   } while(salir==false);
   
   
   //fin
 }
}
