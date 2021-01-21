public class ej51 {
public static void main(String[] args)  {

int[] n=new int[10];

for(int i=0;i<10;i++) {
  n[i]=(int)(Math.random()*102)+2;
  System.out.print(n[i] + " ");
}
System.out.println();

for(int i=0;i<10;i++) {
  System.out.print("El " +n[i] + " ");
  if(funcion.esPrimo(n[i])==true) {
    System.out.print("es primo y ");
  } else {
    System.out.print("no es primo y ");
  }
  
   if(funcion.esCapicua(n[i])==true) {
    System.out.print("es capicua ");
  } else {
    System.out.print("no capicua");
  }  
  System.out.println();
}

//fin
}
}
