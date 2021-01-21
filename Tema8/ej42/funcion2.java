public class funcion2 {


public static void pintar(int n) {
int c1=1;
String[] a;
int anchura=n-1;

 while(c1<=n) {
  a=linea(n,anchura);
  for(int i=0;i<a.length;i++) {
    System.out.print(a[i] + " ");
  }
  System.out.println();
  anchura--;
  c1++;
}

}   


public static String[] linea(int n,int an) {
  String[] o=new String[n];
  
 
  
  for(int i=0;i<n-1;i++) {
    o[i]=" ";
  }
  
   o[0]="*";
  o[an]="*";
  
  return o;
}
 

//Fin
}
