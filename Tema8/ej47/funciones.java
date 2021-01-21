import java.util.Scanner;
public class funciones {
 Scanner s=new Scanner(System.in);
 
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
 //fin
}
