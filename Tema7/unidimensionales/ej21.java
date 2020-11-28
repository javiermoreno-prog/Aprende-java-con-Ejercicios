import java.util.Scanner;
public class ej21 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 

int[] n=new int[15];
int[] aux=new int[15];
boolean esMultiplo=false;
//else 
int dig=0;
int h=0;

for(int i=0;i<15;i++) {
  n[i]=(int)(Math.random()*501);
}

for(int i=0;i<15;i++) {
  aux[i]=n[i];
}

System.out.print("Array original");
System.out.println();

for(int i=0;i<15;i++) {
  System.out.print(n[i] + " ");
}
System.out.println();
System.out.print("Array cincuerizado: ");
for(int i=0;i<15;i++) {
  if(n[i]%5==0) {
    aux[i]=n[i];
  } else {
   dig=n[i]%10;
   if(dig>=5) {
     if((dig-5)>2) {//si i-5>2
       if(dig==8) {
         aux[i]=n[i]+2;
       } else {
         aux[i]=n[i]+1;
       }
     } else {
       
   h=dig-5;
   aux[i]=n[i]-h;
 }
} else if(dig<5) {
  if((5-dig)>2) {//si 5-i>2
    if(dig==1) {
         aux[i]=n[i]-1;
       } else {
         aux[i]=n[i]-2;
       }
  } else {
   h=5-dig;
   aux[i]=n[i]+h;
}
}
}
}
for(int i=0;i<15;i++) {
  System.out.print(aux[i] + " ");
}

//fin del programa
}
}

