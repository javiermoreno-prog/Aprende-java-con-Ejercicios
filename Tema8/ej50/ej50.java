import java.util.Scanner;
public class ej50 {
public static void main(String[] args)  {

int[] a={5,5,5};
int[] b={3,3,3};

int[] c=mezcla(a,b);

for(int i=0;i<c.length;i++) {
  System.out.print(c[i] + " ");
}

}
public static int[] mezcla(int[] a,int[] b) {
  int[] c=new int[a.length+b.length];
  int contA=0;
  int contB=0;
  
  for(int i=0;i<c.length;i++) {
    //metemos de a
    if(contA<a.length && i%2==0) {
      c[i]=a[contA];
      contA++;
    } else if(contA>=a.length && i%2==0) {
      c[i]=b[contB];
      contB++;
   }
    //metemos de a
    if(contB<b.length && i%2==1) {
      c[i]=b[contB];
      contB++;
    }   else if(contB>=b.length && i%2==1) {
      c[i]=a[contA];
      contA++;
   }
}  
    return c;
  }
  
  //fin
}
