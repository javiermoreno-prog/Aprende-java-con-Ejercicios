import java.util.Scanner;
public class ej05 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int maximo=0;
int minimo=1000000;

int[] n=new int [10];

for(int i=0;i<=9;i++) {
  n[i]=s.nextInt();
  if(maximo<n[i]) {
    maximo=n[i];
    
  } 
   if(n[i]<minimo) {
    minimo=n[i];
    
  }
}

for(int i=0;i<=9;i++) {
  System.out.print(n[i] + " ");
  if(n[i]==maximo) {
    System.out.print(" Maximo ");
  }
  if(n[i]==minimo) {
    System.out.print(" Minimo ");
  }
}

//fin del programa
}
}
