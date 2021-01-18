package paquete;
import java.util.Scanner;
public class ej20al28 {


  
  public static int[] generaArray (int n,int min,int max) {
   int[] a=new int[n];
   
   for(int i=0;i<n;i++) {
     a[i]=(int)(Math.random()*(max-min+1)+min);
   }
   
   return a;
  }
  
  public static int minimo(int n[]) {
    int min=n[0];
    
    for(int i=0;i<n.length;i++) {
      if(n[i]<min) {
        min=n[i];
      }
    }
    return min;
  }
  
    public static int maximo(int n[]) {
    int max=n[0];
    
    for(int i=0;i<n.length;i++) {
      if(n[i]>max) {
        max=n[i];
      }
    }
    return max;
  }
  
  public static int media(int n[]) {
    int suma=0;
    
    for(int i=0;i<n.length;i++) {
      suma+=n[i];
    }
    
    int media=suma/n.length;
    
    return media;
  }
  public static boolean esta(int[] n,int l) {
    boolean ok=false;
    for(int i=0;i<n.length;i++) {
      if(n[i]==l) {
        ok=true;
      }
    }
    return ok;
  }
  public static int posicion(int[] n,int l) {
    int pos=0;
      for(int i=0;i<n.length;i++) {
        if(n[i]==l) {
        pos=i;
      }
    }
    return pos;
  }
  public static int[] voltea(int[] n) {
  int[] aux=new int[n.length];
  int contador=0;
  
  for(int i=n.length-1;i>=0;i--) {
    aux[contador]=n[i];
    contador++;
  }
  return aux;
  }
  public static int[] rotaDerecha(int[] n,int a) {
    int aux=0;
    for(int i=0;i<a;i++) {
      aux=n[n.length-1];
      for(int j=n.length-1;j>0;j--) {
        n[j]=n[j-1];
      }
      n[0]=aux;
    }
    return n;
  }
  public static int[] rotaIzquierda(int[] n,int a) {
    int aux=0;
    for(int i=0;i<a;i++) {
      aux=n[0];
      for(int j=0;j<n.length-1;j++) {
        n[j]=n[j+1];
      }
      n[n.length-1]=aux;
    }
    return n;
  }
  //fin
}
