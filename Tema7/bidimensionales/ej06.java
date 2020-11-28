import java.util.Scanner;
public class ej06 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 

int[][] n=new int[6][10];
int maximo=0;
int minimo=1001;
int posMx=0;
int posMy=0;
int posmx=0;
int posmy=0;
boolean repetido=false;

for(int i=0;i<6;i++) {
  for(int j=0;j<10;j++) {
    do {
    n[i][j]=(int)(Math.random()*1001);
    repetido=false;
    for(int z=0;z<10*i+j;z++) {
      if(n[i][j]==n[z/10][z%10]) {
        repetido=true;
      }
    }
  }while(repetido);
  }
}
for(int i=0;i<6;i++) {
  for(int j=0;j<10;j++) {
    if(n[i][j]<minimo) {
      minimo=n[i][j];
      posmx=i;
      posmy=j;
    }
    if(n[i][j]>maximo) {
      maximo=n[i][j];
      posMx=i;
      posMy=j;
    }
  }
}

for(int i=0;i<6;i++) {
  for(int j=0;j<10;j++) {
    System.out.print(n[i][j] + " ");
  }
  System.out.println();
}

System.out.println();
System.out.print("El numero maximo es el: "+ maximo + " Y se encuentra en la fila: "+posMx);
System.out.print(" Y en la columna: "+posMy);
System.out.println();
System.out.print("El numero minimo es el: "+ minimo + " Y se encuentra en la fila: "+posmx);
System.out.print(" Y en la columna: "+posmy);
//fin del programa
}
}
