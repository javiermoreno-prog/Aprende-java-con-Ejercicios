import java.util.Scanner;
public class ej48 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero entero: ");
int n=s.nextInt();

int copia=n;
int longitud=0;


while(copia>0) {
  copia /=10;
  longitud++;
}
  for(int i=0;i<longitud;i++) {
    int digito=n%10;
   for(int j=0;j<10;j++) {
     if(j==digito) { 
       System.out.print("Aparece: "+j);
     } else {
       System.out.print("No aparece: "+j);
  }
  
  System.out.println();
}
}
}
}

