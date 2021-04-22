import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ej03 {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   
  ArrayList<Integer> n=new ArrayList<Integer>();
  
  for(int i=0;i<10;i++) {
    n.add(s.nextInt());
  }
  Collections.sort(n);
  for(int a:n) {
    System.out.print(a + " ");
  }
  //fin
 }
}
