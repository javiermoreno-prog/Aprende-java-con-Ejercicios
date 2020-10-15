import java.util.Scanner;
public class ej16 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String figura="";
String fig1="";
String fig2="";
String fig3="";
for(int i=1;i<=3;i++) {
int f1=(int)(Math.random()*4)+1;
switch(f1) {
  case 1:
  figura="corazon";
  break;
  case 2:
  figura="diamante";
  break;
  case 3:
  figura="herradura";
  break;
  case 4:
  figura="campana";
  break;
  case 5:
  figura="limon";
  break;
  default:
  
}//fin del switch

if(i==1) {
  fig1=figura;
System.out.println(fig1 + " ");
}
if(i==2) {
  fig2=figura;
System.out.println(fig2 + " ");
}
if(i==3) {
  fig3=figura;
System.out.println(fig3 + " ");
}

//fin del for
}
if((fig1==fig2)&& (fig1==fig3)) {
  System.out.println("Enhorabuena, ha ganado 10 monedas");
} else if((fig1==fig2) || (fig1==fig3) || (fig2==fig3)) {
  System.out.println("Has recuperado tu moneda");
} 


//fin del programa
}
}
