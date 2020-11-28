import java.util.Scanner;
public class ej06 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[15];
int[] aux=new int[15];
int j=0;

for(int i=0;i<=14;i++) {
  n[i]=s.nextInt();
}

for(int i=0;i<=14;i++) {
  if(j==0) {
    aux[j]=n[14];
    j++;
  } else {
  aux[j]=n[i-1];
  j++;
}
}


for(int i=0;i<=14;i++) {
  System.out.print(aux[i] + " ");
}
//fin del programa
}
}
