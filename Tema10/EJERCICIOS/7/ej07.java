import java.util.ArrayList;
import java.util.Scanner;
public class ej07 {
 public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   
   ArrayList<Moneda> n=new ArrayList<Moneda>();
   int[] num={1,2,5,10,25,50,1,2};
   String[] pos={"Cara","Cruz"};
   int c1=0;
   int c2=0;
   int c3=0;
   int c4=0;
   boolean acer=false;
   
   for(int i=0;i<6;i++) {
     if(i==0) {
       c1=(int)(Math.random()*num.length);
       c2=(int)(Math.random()*pos.length);
       n.add(new Moneda(num[c1],pos[c2]));
     } else {
       acer=false;
     do {
       c3=(int)(Math.random()*num.length);
       c4=(int)(Math.random()*pos.length);
       if(c3==c1 || c4==c2) {
         acer=true;
         c1=c3;
         c2=c4;  
       }
     } while(acer==false);
      n.add(new Moneda(num[c1],pos[c2]));
     }
     //mostramos
     if(c1==6 || c1==7) {
       System.out.println(n.get(i).getNum() + " euros - " + n.get(i).getPos());
     } else {
       System.out.println(n.get(i).getNum() + " centimos - " + n.get(i).getPos());
     }
   }
 
   //fin
 }
}
/*otra opcion
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class pruebas {
  public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  ArrayList<Moneda> n=new ArrayList<Moneda>();
  Moneda a;
  
  for(int i=0;i<6;i++) {
    if(i==0) {
      n.add(new Moneda());
    } else {
      do {
        a=new Moneda();
      } while((a.getNum() != n.get(i-1).getNum()) && (!(a.getCara().equals(n.get(i-1).getCara()))));
      n.add(a);
    }
    
      System.out.println(n.get(i));
          
  }
  
  
  //fin
 }
}
*/
