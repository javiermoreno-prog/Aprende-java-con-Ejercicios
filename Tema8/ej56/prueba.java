public class prueba {
public static void main(String[] args) {

int[][] n=new int[10][10];

for(int i=0;i<10;i++) {
  for(int j=0;j<10;j++) {
    n[i][j]=(int)(Math.random()*100);
    System.out.print(n[i][j] + " ");
  }
  System.out.println();
}

System.out.println();

int[] q=funciones.corteza(n);

for(int i=0;i<q.length;i++) {
    System.out.print(q[i] + " ");
  }


//fin
}
}
