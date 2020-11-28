import java.util.Scanner;
public class practica {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 

int[][] n=new int[10][9];

for(int i=0;i<10;i++) {
  for(int j=0;j<9;j++) {
    n[i][j]=(int)(Math.random()*201);
  }
}

for(int i=0;i<10;i++) {
  for(int j=0;j<9;j++) {
     
    System.out.print(n[i][j] + " ");
  if(j==8) {
      System.out.println();
    }
  }
}

}
}
