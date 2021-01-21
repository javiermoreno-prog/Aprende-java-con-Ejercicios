public class funcion {


public static String[] cuantos(String[] a) {//contar los repetidos
 String[] b=a.clone();
 boolean encontrado=false;
 
 for(int i=1;i<a.length;i++) {
   encontrado=false;
   for(int j=i-1;j>=0;j--) {
     if(a[j].equals(a[i])) {
       encontrado=true;
     }
   }
   if(encontrado==true) {
     b[i]="";
   }
 }
 
 return b;
}
 
 
//fin
}
