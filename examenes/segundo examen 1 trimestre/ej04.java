import java.util.Scanner;
public class ej04 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
 System.out.println("Dime el dia: ");
 int dia=s.nextInt();
 System.out.println("Dime el mes: ");
 String mes=s.next();
 
 int resMes=0;
 
 switch(mes) {
   case "Enero":
   resMes=6;
   break;
   case "Febrero":
   resMes=2;
   break;
   case "Marzo":
   resMes=2;
   break; 
   case "Abril":
   resMes=5;
   break;
   case "Mayo":
   resMes=0;
   break;
   case "Junio":
   resMes=3;
   break;
   case "Julio":
   resMes=5;
   break;
   case "Agosto":
   resMes=1;
   break;
   case "Septiembre":
   resMes=4;
   break;
   case "Octubre":
   resMes=6;
   break;
   case "Noviembre":
   resMes=2;
   break;
   case "Diciembre":
   resMes=4;
   break;
   default:
 }
 System.out.println("Dime el año: ");
 int anio=s.nextInt();
 
 int resAnio=0;
 int resSiglo=0;
 //calculamos primero el siglo
 int copia=anio;
 
 
 //determinamos el coeficiente del siglo
 int siglo=copia/100;
 
 switch(siglo) {
   case 17:
   resSiglo=5;
   break;
   case 18:
   resSiglo=3;
   break;
   case 19:
   resSiglo=1;
   break;
   case 20:
   resSiglo=0;
   break;
   case 21:
   resSiglo=-2;
   break;
   case 22:
   resSiglo=-4;
   break;
   default:
 }
 //ahora los años
 int copia2=anio%100;
 int resto=copia2/4;
 resAnio=(copia2+resto);
 
 //vamos a ver si son bisiestos
 int resbi=0;
 boolean bi=false;
 if((anio%4==0) && (anio%100!=0) || (anio%400==0)) {
  bi=true;
}
if((bi) && (mes.equals("Enero"))) {
  resbi=-1;
}

int resTotal=(resAnio+resMes+resSiglo+resbi+dia)/7;
System.out.println(resTotal);

 switch(resTotal) {
   case 1:
   System.out.println("Lunes");
   break;
   case 2:
   System.out.println("Martes");
   break;
   case 3:
   System.out.println("Miercoles");
   break;
   case 4:
   System.out.println("Jueves");
   break;
   case 5:
   System.out.println("Viernes");
   break;
   case 6:
   System.out.println("Sabado");
   break;
   case 7:
   System.out.println("Domingo");
   break;
   default:
 }
}
}

