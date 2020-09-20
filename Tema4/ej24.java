import java.util.Scanner;
public class ej24 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
System.out.println("1 - Programador junior");
System.out.println("2 - Prog. senior");
System.out.println("3 - Jefe de proyecto");
System.out.println("Introduzca el cargo del empleado (1 - 3): ");
int cargo=s.nextInt();
double sueldo=0;
switch(cargo) {
  case 1:
  sueldo=950;
  break;
  case 2:
  sueldo=1200;
  break;
  case 3:
  sueldo=1600;
  break;
  default:
}
System.out.println("¿Cuántos días ha estado de viaje visitando clientes?: ");
int dias=s.nextInt();

int sueldoDia=dias*30;
System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
int estado=s.nextInt();
double retencion=0;
if(estado==1) {
  retencion=25;
} else {
  retencion=20;
}
double pIr=(retencion*sueldo)/100;
System.out.println("----------------------------------");
System.out.println("| Sueldo base        " + sueldo + " | ");
System.out.println("| Dietas ("+dias+"viajes)" + sueldoDia+ "| ");
System.out.println("|--------------------------------| ");
System.out.println("| Sueldo bruto       " + (sueldo+sueldoDia)+ "| ");
System.out.println("| Retencion          "+pIr + "| ");
System.out.println("|--------------------------------| ");
System.out.println("| Sueldo neto        " +(sueldo*((100-retencion)/100)) + "| ");
System.out.println("----------------------------------");
}
}

