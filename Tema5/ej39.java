import java.util.Scanner;
public class ej39 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime el numero entero: ");
int n=s.nextInt();
int factorial=2;

  if(n==1) {
    System.out.println("1");
    factorial=1;
  } 
   if(n==2) {
    System.out.println("2");
    factorial=2;
  }
for(int i=2;i<n;i++) {
 System.out.println(i +"factorial: "+ (i*factorial));
 factorial=i*factorial;
}

}
}

    
