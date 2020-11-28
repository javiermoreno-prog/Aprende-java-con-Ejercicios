import java.util.Scanner;
public class practica2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in); 

int[][] n={{8,2},{3,4},{7,4}};





for(int i=0;i<3;i++) {
  for(int j=0;j<2;j++) {
  
    System.out.print(n[i][j] + " ");
    if(j==1) {
      System.out.println();
    } 
  }
}

}
}
