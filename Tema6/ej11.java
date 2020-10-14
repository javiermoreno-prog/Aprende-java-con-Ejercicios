import java.util.Scanner;
public class ej11 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=0;
int contadorSusp=0;
int contadorSuf=0;
int contadorBien=0;
int contadorNot=0;
int contadorSobre=0;

for(int i=0;i<=20;i++) {
  n=(int)(Math.random()*11);
  if(n<5) {
    System.out.println("Suspenso");
    contadorSusp++;
  }
  if(n==5) {
    System.out.println("Suficiente");
    contadorSuf++;
  }
  if(n==6) {
    System.out.println("Bien");
    contadorBien++;
  }
  if((n>=6) && (n<=8)) {
    System.out.println("Notable");
    contadorNot++;
  }
  if((n>=9) && (n<=10)) {
    System.out.println("Sobresaliente");
    contadorSobre++;
   }
 }
 System.out.println("Sobresaliente: "+contadorSobre);
 System.out.println("Suspenso: "+contadorSusp);
 System.out.println("Suficiente: "+contadorSuf);
 System.out.println("Bien: "+contadorBien);
 System.out.println("Notable: "+contadorNot);
}
}
