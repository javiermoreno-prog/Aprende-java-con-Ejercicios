import java.util.Scanner;
public class ej60 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la altura: ");
int altura=s.nextInt();

for(int i=1;i<altura-2;i++) {
  System.out.println("***     ***");
}
System.out.println("******  ******");
System.out.println("******  ******");
}
}
