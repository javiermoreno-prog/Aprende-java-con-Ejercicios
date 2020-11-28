import java.util.Scanner;
public class ej03 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[10];

for(int i=0;i<=9;i++) {
 n[i]=s.nextInt();
   }
   for(int i=9;i>=0;i--) {
     System.out.print(n[i] + " ");
   }
   
   //fin del programa
 }
}
