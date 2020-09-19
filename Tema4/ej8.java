import java.util.Scanner;
public class ej8 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("dime la primera nota: ");
 int n1=s.nextInt();
 System.out.println("dime la segunda nota: ");
 int n2=s.nextInt();
 System.out.println("dime la tercera nota: ");
 int n3=s.nextInt();
 
 double media;
 media=(n1+n2+n3)/3;
 System.out.println("la media es: "+media);
 if(media<5) {
   System.out.println("insuficiente");
 }
 if(media==5) {
   System.out.println("suficiente");
 }
 if(media==6) {
   System.out.println("bien");
 }
 if((media==7) || (media==8)) {
   System.out.println("notable");
 }
 if((media==9) || (media==10)) {
   System.out.println("sobresaliente");
 }
}
}
