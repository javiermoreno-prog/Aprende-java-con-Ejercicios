public class ej2 {
public static void main(String[] args) {
int numPalo=(int)(Math.random()*5);
int numCarta=(int)(Math.random()*14);

switch(numPalo) {
  case 1:
  System.out.println("Pica");
  break;
  case 2:
  System.out.println("Corazones");
  break;
  case 3:
  System.out.println("Diamantes");
  break;
  case 4:
  System.out.println("Tréboles");
  break;
  default:
}

switch(numCarta) {
  case 1:
  System.out.println("2");
  break; 
  case 2:
  System.out.println("3");
  break;
  case 3:
  System.out.println("4");
  break;
  case 4:
  System.out.println("5");
  break;
  case 5:
  System.out.println("6");
  break;
  case 6:
  System.out.println("7");
  break;
  case 7:
  System.out.println("8");
  break;
  case 8:
  System.out.println("9");
  break;
  case 9:
  System.out.println("10");
  break;
  case 10:
  System.out.println("J");
  break;
  case 11:
  System.out.println("Q");
  break;
  case 12:
  System.out.println("K");
  break;
  case 13:
  System.out.println("A");
  break;
  default:
}


}
}
