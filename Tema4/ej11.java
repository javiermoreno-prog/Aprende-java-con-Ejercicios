import java.util.Scanner;
public class ej11 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("dime la hora: ");
 int hora=s.nextInt();
 System.out.println("dime los minutos: ");
 int minutos=s.nextInt();
 
  if(minutos==0) {
    int totalHoras=24-hora;
    int totalMinutos=0;
    System.out.println("faltan "+totalHoras+ " horas "+ totalMinutos + " minutos,para medianoche");
  } else {
    int totalHoras=24-hora;
    totalHoras=totalHoras-1;
    int totalMinutos=60-minutos;
     System.out.println("faltan "+totalHoras+ " horas "+ totalMinutos + " minutos,para medianoche");
   }
 }
}
