import java.util.Scanner;
public class ej19 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int maximo=0;
int minimo=200;
int contador=0;
int suma=0;

for(int i=1;i<=50;i++) {
  int n=(int)(Math.random()*301)-100;
  contador++;
  if(n>maximo) {
    maximo=n;
  }
  if(n<minimo) {
    minimo=n;
  }
  suma+=n;
    System.out.print(n+ " ");
}
System.out.println();
System.out.println("Maximo: "+maximo);
System.out.println("Minimo: "+minimo);
System.out.println("Media: "+(suma/contador));

}
}
