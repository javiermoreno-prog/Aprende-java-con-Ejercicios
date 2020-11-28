import java.util.Scanner;
public class ej20 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 

System.out.println("Dime la cantidad de reyes: ");
int cantidad=s.nextInt();
System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO");

String[] n=new String[cantidad];
String[] aux=new String[cantidad];
int contador=2;



for(int i=0;i<cantidad;i++) {
  n[i]=s.next();
   aux[i]=n[i];
   contador=2;
   
  for(int j=0;j<i;j++) {
    if(n[i].equals(n[j])) {
      aux[i]=n[i] +  contador;
      contador++;
    }
  }
  System.out.println();
}
//mostrarlo
for(int i=0;i<cantidad;i++) {
  System.out.print(aux[i] + " ");
}

//fin del programa
}
}
