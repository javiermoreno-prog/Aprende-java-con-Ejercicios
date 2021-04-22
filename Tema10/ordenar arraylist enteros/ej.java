import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;//necesario para ordenar
public class ej {
  public static void main(String[] args) {
  HashMap<Integer,Integer> lista=new HashMap<Integer,Integer>();
  lista.put(3,3);
  lista.put(9,9);
  lista.put(8,8);
  ArrayList<Integer> res=colocar(lista);
  Collections.sort(res);//necesario para ordenar
  System.out.print(res);
    
  //fin
 }
 public static ArrayList colocar(HashMap<Integer,Integer> m) {
   /*1opcion a traves del constructor*/
   //ArrayList<Integer> n=new ArrayList<Integer>(m.keySet());
   /*2opcion solo para key*/
   /*ArrayList<Integer> n=new ArrayList<Integer>();
   for(int a:m.keySet()) {
     n.add(a);
   }*/
   /*tercera opcion:total*/
   int e=0;
   ArrayList<Integer> n=new ArrayList<Integer>();
      for(Map.Entry a:m.entrySet()) {
        e=(int)a.getValue();
        n.add(e);
      }
      
   return n;
 }

//fin
}
