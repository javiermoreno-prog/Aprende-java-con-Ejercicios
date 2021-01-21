import java.util.Scanner;
public class ej48 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
 int[] a={1,2,3};
 int[] b={3,2,1};
 
 int[] c=concatena(a,b);
 
 for(int i=0;i<c.length;i++) {
   System.out.print(c[i] + " ");
 }
 
}
public static int[] concatena(int[] a,int[] b) {
  int[] c=new int[a.length+b.length];
  int contador=0;
  
  for(int i=0;i<a.length;i++) {
    c[contador]=a[i];
     contador++;
  }
  for(int i=0;i<b.length;i++) {
    c[contador]=b[i];
     contador++;
  }
  return c;
}


//fin
}
