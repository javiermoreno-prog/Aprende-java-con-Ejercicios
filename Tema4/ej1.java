import java.util.Scanner;
public class ej1 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("dime un dia de la semana y te digo que asignatura toca a primera hora ese dia: ");
 String dia=s.next();
 String asignatura= "";
  
 switch(dia) {
  case "lunes":
   asignatura="prog";
   break;
  case "martes":
  asignatura="bd"; 
  break;
  case "miercoles":
  asignatura="lm";
  break; 
  case "jueves": 
  asignatura="en";
  break;
  case "viernes": 
  asignatura="fol";
  break;
  default:
  }
  System.out.println(asignatura);
}
}
