import java.util.Scanner;
public class ej6 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
System.out.println("dime la altura: ");
int h=s.nextInt();
double total=0;
 total=Math.sqrt((2*h)/9.81);
 System.out.println("el tiempo en caer es: "+total);
}
}
