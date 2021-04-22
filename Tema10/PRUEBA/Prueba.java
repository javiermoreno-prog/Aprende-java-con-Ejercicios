import java.util.ArrayList;

public class Prueba {
  public static void main(String[] args) {
  ArrayList<Integer> n=new ArrayList<Integer>();
  
  System.out.println("Tamaño: "+n.size());
  n.add(1);
  n.add(2);
  n.add(3);
  n.remove(0);
  n.add(0,1);
  
  System.out.print(n);
  
  /*for(int a:n) {
    System.out.print(a + " ");
  }*/
  
    //fin
  }
}
