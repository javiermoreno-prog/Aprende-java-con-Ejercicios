import java.util.Scanner;
public class ej22 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);

System.out.println("dime el dia: ");
String dia=s.next();
int horasDia=0;

switch(dia) {
  case "lunes":
  horasDia=96;
  break;
  case "martes":
  horasDia=72;
  break;
  case "miercoles":
  horasDia=48;
  break;
  case "jueves":
  horasDia=24;
  break;
 default:
}
System.out.println("dime la hora: ");
int horas=s.nextInt();
System.out.println("dime los minutos: ");
int minutos=s.nextInt();

if(minutos==0) {
  int totalHoras=15-horas;
  int totalMin=0;
  horasDia=horasDia*60;
totalHoras=totalHoras*60;
System.out.println("la cantidad de minutos hasta el fin de semana es de "+(horasDia+totalHoras+totalMin));
} else {
  int totalHoras=14-horas;
  int totalMin=60-minutos;

horasDia=horasDia*60;
totalHoras=totalHoras*60;
System.out.println("la cantidad de minutos hasta el fin de semana es de "+(horasDia+totalHoras+totalMin));
}
}
}
