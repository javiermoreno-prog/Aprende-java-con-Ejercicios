import java.util.ArrayList;
public class ej01 {
 public static void main(String[] args) {
   ArrayList<String> n=new ArrayList<String>();
   
   for(int i=0;i<6;i++) {
     n.add("j"+i);
   }
   
   for(String a:n) {
     System.out.print(a + " ");
   }
   //fin
 }
}
