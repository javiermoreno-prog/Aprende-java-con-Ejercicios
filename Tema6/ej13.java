import java.util.Scanner;
public class ej13 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int d1=0;
int d2=0;

do {
 d1=(int)(Math.random()*8);
 d2=(int)(Math.random()*8);  
  System.out.print(d1 + " "+ d2);
System.out.println();
} while(d1!=d2);
}
}
