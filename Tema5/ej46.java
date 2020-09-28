import java.util.Scanner;
public class ej46 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Dime la anchura: ");
int anchura=s.nextInt();
System.out.println("Dime la altura: ");
int altura=s.nextInt();


for(int i=0;i<anchura;i++) {
  System.out.print("*");
}
System.out.println();

for(int i=0;i<altura-2;i++) {
  System.out.print("*");
  for(int j=2;j<anchura;j++) {
   System.out.print(" ");
 }
 System.out.print("*");
System.out.println();
}
for(int i=0;i<anchura;i++) {
  System.out.print("*");
}
}
}
