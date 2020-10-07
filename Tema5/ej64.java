import java.util.Scanner;
public class ej64 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int anchura=9;
int altura=3;
int planta=1;
int opcion=0;
do {
for(int i=0;i<anchura;i++) {
  System.out.print("*");
}
System.out.println();

while(planta<=altura-2) {
  System.out.print("*");
  for(int i=1;i<=anchura-2;i++) {
    System.out.print(" ");
  }
  System.out.print("*");
System.out.println();
planta++;
}
for(int i=0;i<anchura;i++) {
  System.out.print("*");
}
System.out.println();
System.out.println("1.Agrandarlo");
System.out.println("2. Achicarlo");
System.out.println("3. Cambiar la orientación");
System.out.println("4. Salir");
System.out.println("Indique qué quiere hacer con el rectángulo: ");
opcion=s.nextInt();

switch(opcion) {
case 1:
altura+=2;
anchura++;
break;
case 2:
altura--;
anchura--;
break;
case 3:
int aux=altura;
altura=anchura;
anchura=aux;
break;
    default:
  }
}while(opcion!=4);
} 
}

