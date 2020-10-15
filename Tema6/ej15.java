import java.util.Scanner;
public class ej15 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int longitud=(int)(Math.random()*28)+4;
int primera=0;
int contador=0;
for(int i=0;i<=longitud;i++) {
int nota=(int)(Math.random()*7)+1;
if(i==0) {
   primera=nota;
 }
switch(nota) {
    case 1:
    System.out.print("do"+ " ");
    contador++;
    break;
    case 2:
    System.out.print("re"+ " ");
    contador++;
    break;
     case 3:
    System.out.print("mi"+ " ");
    contador++;
    break;
     case 4:
    System.out.print("fa"+ " ");
    contador++;
    break;
     case 5:
    System.out.print("sol"+ " ");
    contador++;
    break;
     case 6:
    System.out.print("la"+ " ");
    contador++;
    break;
     case 7:
    System.out.print("si"+ " ");
    contador++;
    break;
    default:
  }
  if(contador%4==0) {
    System.out.print("|");
  }
 
}
switch(primera) {
    case 1:
    System.out.print("do"+ " ");
    
    break;
    case 2:
    System.out.print("re"+ " ");
 
    break;
     case 3:
    System.out.print("mi"+ " ");
    
    break;
     case 4:
    System.out.print("fa"+ " ");

    break;
     case 5:
    System.out.print("sol"+ " ");
  
    break;
     case 6:
    System.out.print("la"+ " ");
   
    break;
     case 7:
    System.out.print("si"+ " ");
    break;
    default:
  }

System.out.print("||");

}
}
