import java.util.Scanner;
public class ej04 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int[] numeros=new int[20];
int[] cuadrado=new int[20];
int[] cubo=new int[20];

for(int i=0;i<=19;i++) {
  numeros[i]=(int)(Math.random()*100);
}
 
for(int i=0;i<=19;i++) {
  cuadrado[i]=numeros[i]*numeros[i];
}

for(int i=0;i<=19;i++) {
  cubo[i]=cuadrado[i]*numeros[i];
}


//numeros
for(int i=0;i<=19;i++) {
  System.out.printf("%2d",numeros[i]);
 
  System.out.printf("%6d",cuadrado[i]);
 
  System.out.printf("%10d",cubo[i]);
  System.out.println();
}


}
}
