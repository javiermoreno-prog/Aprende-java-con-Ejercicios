import java.util.Scanner;
public class ej18 {
public static void main(String[] args)  
throws InterruptedException{
  
int a=1723;

int resul=0;

int copia=a;

 while(copia>3) {
   resul+=(int)copia%2;
   resul*=10;
  
     copia=(int)copia/2;   
   
   
   System.out.println("\u001B[32m" + copia);
   System.out.println("\u001B[35m" + resul);
   
 }
 System.out.print(resul+1);
 
 //fin
 
 }
 }
