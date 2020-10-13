import java.util.Scanner;
public class ej9 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int n=0;
int contador=0;
do {
  n=(int)(Math.random()*101);
  if((n%2)==0) {
  System.out.print(n + " ");
  contador++;
}
} while(n!=24);
System.out.print("contador: " + contador);
}
}

  
  
  
