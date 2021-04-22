import java.util.ArrayList;
public class ej08 {
 public static void main(String[] args) {
   ArrayList<Carta> n =new ArrayList<Carta>();
   String[] a = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
   String[] p = {"bastos", "copas", "espadas", "oros"};
   int c1=0;
   int c2=0;
   boolean acer=false;
   
   for(int i=0;i<5;i++) {
     acer=true;
     if(i==0) {
       c1=(int)(Math.random()*a.length);
       c2=(int)(Math.random()*p.length);
       n.add(new Carta(a[c1],p[c2]));
     } else {
      do {
        c1=(int)(Math.random()*a.length);
        c2=(int)(Math.random()*p.length);
      
        for(int j=0;j<i;j++) {
         if(a[c1].equals(n.get(j).getNum()) && p[c2].equals(n.get(j).getPalo())) {
           acer=false;
         } 
        }
      } while(acer==false);   
      n.add(new Carta(a[c1],p[c2]));
     }
    }
    for(Carta b:n) {
      System.out.println(b);
    }
   //fin
  }
 }
