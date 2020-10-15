import java.util.Scanner;
public class ej18 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

for(int i=1;i<=3;i++) {
  
  int color=(int)(Math.random()*6)+1;
  
  switch(color) {
    case 1:
    System.out.println("rojo");
    break;
    case 2:
    System.out.println("azul");
    break;
    case 3:
    System.out.println("verde");
    break;
    case 4:
    System.out.println("amarillo");
    break;
    case 5:
    System.out.println("violeta");
    break;
    case 6:
    System.out.println("naranja");
    break;
    default:
  }
  
}
}
}
