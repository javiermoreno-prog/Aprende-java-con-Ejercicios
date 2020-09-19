import java.util.Scanner;
public class ej16 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 int puntos=0;
 String respuesta;
 
 System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Ha aumentado sus gastos de vestuario: ");
   respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Ha perdido el interés que mostraba anteriormente por ti: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("No te deja que mires la agenda de su teléfono móvil: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Has notado que últimamente se perfuma más: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
 respuesta=s.next();
 if(respuesta.equals("s")) {
   puntos+=3;
 }
 if((puntos>=0) && (puntos<=10)) {
   System.out.println(" ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
 }
 if((puntos>=11) && (puntos<=22)) {
   System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
 }
 if((puntos>=22) && (puntos<=30)) {
   System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona");
 }
}
}
