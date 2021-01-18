import bi.*;
public class prueba {
public static void main(String[] args)  
throws InterruptedException{

//genera
int[][] a=bi.ej29al34.generaArrayBi(3,3,1,99);

for(int i=0;i<3;i++) {
  for(int j=0;j<3;j++) {
    System.out.print(a[i][j] + " ");
  }
  System.out.println();
}
//fila
System.out.println();
int[] b=bi.ej29al34.filaDeArrayBi(a,0);

for(int i=0;i<3;i++) {
  System.out.print(b[i] + " ");
}
//columna
System.out.println();
int[] c=bi.ej29al34.columnaDeArrayBi(a,1);

for(int i=0;i<3;i++) {
  System.out.print(c[i] + " ");
}
//coordenadas
System.out.println();
int[] d=bi.ej29al34.coordenadasBi(a,1);

for(int i=0;i<2;i++) {
  System.out.print(d[i] + " ");
}
//esPunto
System.out.println();
System.out.println("ES PUNTO: ");
int[][] aux=bi.ej29al34.generaArrayBi(3,3,7,20);
for(int i=0;i<3;i++) {
  for(int j=0;j<3;j++) {
    System.out.print(aux[i][j] + " ");
  }
  System.out.println();
}
System.out.print(bi.ej29al34.esPunto(aux,12));
//diagonal
System.out.println();
int[] u=bi.ej29al34.diagonal(a,3,3,"neso");
 for(int i=0;i<3;i++) {
   System.out.print(u[i] + " ");
 }
//fin
}
}
