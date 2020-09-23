import java.util.Scanner;
public class ej21 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime numeros: ");
int contadorImpar=0;
int contador=0;
int mayorPar=0;
int suma=0;
int numero;
do {
  numero=s.nextInt();
  contador++;
  if((numero%2)==1) {
    contadorImpar++;
    suma+=numero;
  } else {
    if(numero>mayorPar) {
      mayorPar=numero;
    }
  }
} while(numero>0);

System.out.println("Cuantos has introducido: "+contador);
System.out.println("Media impar: "+(suma/contadorImpar));
System.out.println("Mayor par: "+mayorPar);
}
}

