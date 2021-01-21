import java.util.Scanner;
public class ej49 {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);


int[] original=new int[10];
original[0]=1;

int contador=0;
String[] res=new String[10];
res[0]="1";
String res2="";
int[] aux=new int[1];
int cres=0;

for(int i=0;i<10;i++) {
  contador=1;
  for(int j=0;j<i;j++) {
    if(original[i]==original[j]) {
      contador++;
    }
  }
  
aux[0]=contador*10+original[i];
res2=convierteEnString(aux);
System.out.print(res2);

}
original=concatena(original,aux);
}

public static int voltea(int x) {
  int res=0;
  
  while(x>0) {
    res+=x%10;
    x/=10;
    res*=10;
  }
  return res/10;
}

 public static String convierteEnString(int[] x) {
   String res="";
   for(int i=0;i<x.length;i++) {
   if(x[i]==0) {
     res+="";
   } else {
   res+=x[i] +",";
 }
}
 
   return res;
   
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

