import java.util.Scanner;
public class kdise {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
  System.out.println("Dime el limite: ");
  int limite=s.nextInt();
  
  int sumaInferior=0;
  int sumaSuperior=2;
  
  int k=3;
  
  for(int i=2;i<limite;i++) {
    sumaInferior+=i-1;
    sumaSuperior-=i;
    
    while(sumaSuperior<sumaInferior) {
      sumaSuperior+=k;
      k++;
    }
    if(sumaSuperior==sumaInferior) {
      System.out.println(i);
    }
  }
}
}
