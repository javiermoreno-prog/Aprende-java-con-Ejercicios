import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ej04 {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  ArrayList<String> n=new ArrayList<String>();
  
  for(int i=0;i<10;i++) {
    n.add(s.next());
  }
  Collections.sort(n);
  for(String a:n) {
    System.out.print(a + " ");
  }

  //fin
}
}
