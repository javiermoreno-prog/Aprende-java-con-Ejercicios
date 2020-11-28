import java.util.Scanner;
public class ej07 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int[] n=new int[100];

for(int i=0;i<=99;i++) {
  n[i]=(int)(Math.random()*20);
}

for(int i=0;i<=99;i++) {
  System.out.print(" "+ n[i] + " ");
}

System.out.println();
System.out.println("Dime los valores que quieres cambiar");
System.out.println("Dime el primero: ");
int v1=s.nextInt();
System.out.println("Dime el segundo: ");
int v2=s.nextInt();


for(int i=0;i<=99;i++) {
  if(i==v1) {
  System.out.print("'"+ n[v2] + "'");
} else {
 System.out.print(" "+ n[i] + " ");
}
}

}
}

  
