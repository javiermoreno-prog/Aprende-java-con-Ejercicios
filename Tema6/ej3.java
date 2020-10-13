public class ej3 {
public static void main(String[] args) {

int numCarta=(int)(Math.random()*11);

String respuesta="";

switch(numCarta) {
  case 8:
  respuesta="sota";
  break;
  case 9:
  respuesta="caballo";
  break;
  case 10:
  respuesta="rey";
  break;
  case 11:
  respuesta="as";
  break;
  default:
  respuesta=String.valueOf(numCarta);
}
System.out.print(respuesta);

}
}
