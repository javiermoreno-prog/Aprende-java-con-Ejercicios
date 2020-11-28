import java.util.Scanner;
public class ej09 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[8];


for(int i=0;i<8;i++) {
System.out.print("Dime un numero: ");
 n[i]=s.nextInt();
 
}

for(int i=0;i<8;i++) {
  if(n[i]%2==0) {
    System.out.print(n[i] + " par ");
  } else {
    System.out.print(n[i] + " impar ");
  }
  System.out.println();
}

//fin del programa
}
}


