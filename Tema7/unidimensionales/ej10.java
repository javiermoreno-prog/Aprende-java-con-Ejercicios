import java.util.Scanner;
public class ej10 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int[] n=new int[20];
int[] aux=new int[20];
int j=0;
int z=0;
for(int i=0;i<20;i++) {
  n[i]=(int)(Math.random()*101);
}

for(int i=0;i<20;i++) {
  if(n[i]%2==0) { //pares
    aux[j]=n[i];
    j++;
  } else { //impares
    aux[19-z]=n[i];
    z++;
}
}

for(j=0;j<20;j++) {
  System.out.print(aux[j] + " ");

}

}
}
/*otra forma no se si es mas eficiente
int[] n=new int[20];
  int[] aux=new int[20];
  int j=0;
  for(int i=0;i<20;i++) {
    n[i]=(int)(Math.random()*101);
  }
  
  for(int i=0;i<20;i++) {
    System.out.print(n[i] + " ");
  } 
  System.out.println();
 
 for(int i=0;i<20;i++) {
   if(n[i]%2==0) {
     aux[i-j]=n[i];
   } else {
     aux[19-j]=n[i];
     j++;
   }
 }
 for(int i=0;i<20;i++) {
    System.out.print(aux[i] + " ");
  } 
 
}
}
*/
