import java.util.Scanner;
public class ej01 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
//Los valores no inicializados se ponen en 0
int[] num=new int[12];
num[0]=39;
num[1]=-2;
num[4]=0;
num[6]=14;
num[8]=5;
num[9]=120;

for(int i=0;i<=11;i++) {
  System.out.print(num[i] + " ");
}

//fin del programa
}
}
