import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class ej15 {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   String producto="";
   int cantidad=0;
   
   HashMap<String,Double> m=new HashMap<String,Double>();
   ArrayList<Integer> cantida=new ArrayList<Integer>();
   ArrayList<String> nombre=new ArrayList<String>();
   
   m.put("avena", 2.21);
   m.put("garbanzos", 2.39);
   m.put("tomate", 1.59);
   m.put("jengibre", 3.13);
   m.put("quinoa", 4.50);
   m.put("guisantes", 1.60);
   int total=0;
   int posicion=0;
   boolean desc=false;
   String descuento="";
   
   do {
   System.out.println("Dime producto: ");
   producto=s.next(); 
   if(producto.equals("fin")) {
     System.out.println("FACTURA");
   } else {
     System.out.println("Dime cantidad: ");
     cantidad=s.nextInt();
     
     
     //vemos si el producto esta repetido
     if(nombre.contains(producto)) {
       posicion=nombre.indexOf(producto);
       cantida.set(posicion,cantida.get(posicion)+cantidad);
     } else {
     cantida.add(cantidad);
     nombre.add(producto);
    }
   }
  }while(!(producto.equals("fin")));
  
  System.out.println("Introduzca código de descuento (INTRO si no tiene ninguno): ");
   descuento=s.next();
  
  if(descuento.equals("ECODTO")) {
    desc=true;
  }
  
  //presentamos
  System.out.printf("%9s %7s %9s %9s","Producto","Precio","Cantidad","Subtotal\n");
  System.out.println("-----------------------------------------");
  for(int i=0;i<cantida.size();i++) {
    System.out.printf("%-9s %7.2f %9s %9.2f",nombre.get(i),m.get(nombre.get(i)),cantida.get(i),(m.get(nombre.get(i))*cantida.get(i)));
    System.out.println();
    total+=m.get(nombre.get(i))*cantida.get(i);
  }
  System.out.println("-----------------------------");
  if(desc==true) {
    System.out.println("Descuento: "+(total*0.1));
  }
  System.out.println("-----------------------------");
  double h=total*0.1;
  System.out.println("Total: "+(total-h));
   //fin
 }
}
