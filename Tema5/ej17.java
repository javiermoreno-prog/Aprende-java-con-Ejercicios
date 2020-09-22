import java.util.Scanner;
public class ej17 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Dime un numero positivo: ");
int numero=s.nextInt();
int suma=0;

if(numero>0) {
for(int i=numero;i<(numero+100);i++) {
suma+=i;
}
System.out.println("La suma es: "+suma);
    
}else {
System.out.println("Tiene que ser un numero positivo");
}
}
}
