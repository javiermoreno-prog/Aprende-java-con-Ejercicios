public class ej53 {
public static void main(String[] args)  {
 
int[][] n=new int[3][3];

  for(int i=0;i<n.length;i++) {
    for(int j=0;j<n[0].length;j++) {
    n[i][j]=(int)(Math.random()*100);
    System.out.print(n[i][j] + " ");
  }
  System.out.println();
}

System.out.println();
int a=funcion.nEsimo(n,2);
System.out.print(a);

//fin
}
}
