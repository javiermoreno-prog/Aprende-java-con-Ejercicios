import java.util.Scanner;
public class ej18 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Dime un numero: ");
int n1=s.nextInt();

System.out.println("Dime otro numero: ");
int n2=s.nextInt();

if(n1>n2) {
  for(int i=n2;i<n1;i+=7) {
    System.out.print(i + " ");
  }
} else {
  for(int i=n1;i<n2;i+=7) {
    System.out.print(i + " ");
  }
}
}
}
