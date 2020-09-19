import java.util.Scanner;
public class ej3 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
System.out.println("dime un numero: ");
int numero=s.nextInt();
String dia= "";
  switch(numero) {
    case 1:
    dia="Lunes";
    break;
    case 2:
    dia="Martes";
    break;
    case 3:
    dia="Miercoles";
    break;
    case 4:
    dia="Jueves";
    break;
    case 5:
    dia="Viernes";
    break;
    case 6:
    dia="Sabado";
    break;
    case 7:
    dia="Domingo";
    break;
    default:
    System.out.println("los numeros deben ser <7 y >1");
  }
  System.out.println(dia);
}
}
