import java.util.Scanner;
public class ej04v2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//estirar numeros mejorado
//javier moreno aguilera
int n;
int e;
do {
System.out.println("DIME UN NUMERO: ");
 n=s.nextInt();
 if(n==0) {
   System.out.println("El número cero no vale. ");
 }
 if(n<0) {
   System.out.println("Ha introducido un valor negativo. Se considerará como positivo. ");
   n=n*(-1);
 }
} while((n==0));
do {
System.out.println("DIME el estiramiento: ");
e=s.nextInt();
if((e==0) || (e<0)) {
   System.out.println("No acepto estiramientos negativos ni nulos. ");
 }
} while((e==0) || (e<0));
String respuesta="";

int copia=n;
int longi=0;

//longitud del numero
while(copia>0) {
  longi++;
  copia/=10;
}
copia=n;
//volteado
int volteado=0;
while(copia>0) {
  volteado=(volteado*10)+(copia%10);
  copia/=10;
}

//datos para estirar
int dig=0;


for(int i=1;i<=longi;i++) {
  dig=volteado%10;
    if(e%2==0) {
    for(int j=1;j<=e/2;j++) {
    respuesta+=dig*10+dig;
  }
} else {
  for(int j=1;j<=e;j++) {
    
    respuesta+=dig;
  }

 
}
   volteado/=10;

}
System.out.println(respuesta);



//fin del programa
}
}

