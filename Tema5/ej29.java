import java.util.Scanner;
public class ej29 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime un numero: ");
int n1=s.nextInt();
System.out.println("Dime otro numero: ");
int n2=s.nextInt();

for(int i=0;i<n1;i++) {
  if((i%n2)==1) {
    System.out.println(i);
  }
}
}
}
