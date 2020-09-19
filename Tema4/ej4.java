import java.util.Scanner;
public class ej4 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
System.out.println("dime el numero de horas: ");
int horas=s.nextInt();
int total=0;
if(horas<40) {
  total=horas*12;
  System.out.println("El sueldo semanal que le corresponde es de "+ total + " euros");
} else {
  int extras=horas-40;
 
  horas=horas-extras;
   extras=extras*16;
   horas=horas*12;
   
   total=extras+horas;
   System.out.println("El sueldo semanal que le corresponde es de "+ total + " euros");
 }
}
}
