public class ej28 {
public static void main(String[] args) {
System.out.println("JUEGO PIEDRA,PAPEL, Y TIJERAS");
System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
String opcion1=System.console().readLine();
System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
String opcion2=System.console().readLine();

if(opcion1.equals(opcion2)) {
  System.out.println("Empate");
} else {
  int ganador=2;
  switch(opcion1) {
    case "piedra":
    if(opcion2.equals("tijera")) {
      ganador=1;
    }
    break;
    case "papel":
if (opcion2.equals("piedra")) {
ganador = 1;
}
break;
case "tijera":
if (opcion2.equals("papel")) {
ganador = 1;
}
break;
default:
}
System.out.println("Gana el jugador " + ganador);
}
}
}
