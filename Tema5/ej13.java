import java.util.Scanner;
public class ej13 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int pos=0;
int neg=0;

for(int i=0;i<10;i++) {
  System.out.println("dime un numero y te dire si es positivo o negativo: ");
  int numero=s.nextInt();
  if(numero>0) {
    pos++;
  } else {
    neg++;
  }
}
System.out.println("positivos: "+pos);
System.out.println("negativos: "+neg);
}
}
