import java.util.Scanner;
public class ej2 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 
 System.out.println("dime la hora: ");
 int hora=s.nextInt();
 
 if((hora<=12) && (hora>=6)) {
   System.out.println("buenos dias");
 }
 if((hora<=20) && (hora>=13)) {
 System.out.println("buenas tardes");
} 
if((hora>=21) || (hora<=5)) {
 System.out.println("buenas noches");
}
}
}
