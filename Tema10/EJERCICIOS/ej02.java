import java.util.ArrayList;
public class ej02 {
 public static void main(String[] args) {

 int tamanio=(int)(Math.random()*11)+10;
 
 ArrayList<Integer> n=new ArrayList<Integer>();
 int suma=0;
 int contador=0;
 int maximo=0;
 int minimo=101;
 
 for(int i=0;i<tamanio;i++) {
   n.add((int)(Math.random()*101));
   contador++;
   suma+=n.get(i);
   if(n.get(i)>maximo) {
     maximo=n.get(i);
   } 
   if(n.get(i)<minimo) {
     minimo=n.get(i);
   }
 }
 
 for(int a:n) {
   System.out.print(a + " ");
 }
 System.out.println();
 System.out.println("Suma: "+suma);
 System.out.println("Media: "+(suma/contador));
 System.out.println("Maximo: "+maximo);
 System.out.println("Minimo: "+minimo);
  //fin
 }
}
