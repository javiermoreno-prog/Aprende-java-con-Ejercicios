public class ej5 {
public static void main(String[] args) {
int numero;
int suma=0;
int maximo=0;
int minimo=200;
int contador=0;

for(int i=0;i<49;i++) {
   numero=(int)(Math.random()*100)+100;
   suma+=numero;
   contador++;
   if(minimo>numero) {
     minimo=numero;
   }
   if(maximo<numero) {
     maximo=numero;
   }
  System.out.print(numero + " ");
}
System.out.println("Media: "+(suma/contador));
System.out.println("Maximo: "+maximo);
System.out.println("Minimo: "+minimo);
}
}
