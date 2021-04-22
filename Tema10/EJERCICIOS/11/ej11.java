import java.util.HashMap;
import java.util.Map;
public class ej11 {
 public static void main(String[] args) {
  HashMap<String,String> m=new HashMap<String,String>();
  
  String[] e={"a","b","c","d","e","f","g"};
  String[] n={"h","i","j","k","l","m","n"};
  
  for(int i=0;i<e.length;i++) {
    m.put(e[i],n[i]);
  }
  
   //generamos las palabras
   int acertadas=0;
   int ale=0;
   String opcion="";
   
   for(int i=0;i<5;i++) {
    ale=(int)(Math.random()*e.length);
    
    System.out.println("Dime la traduccion de "+e[ale]);
    opcion=System.console().readLine();
    
    //comprobamos si esta bien o no
    if(opcion.equals(m.get(e[ale]))) {
      System.out.println("Correcto");
      acertadas++;
    } else {
    System.out.println("Incorrecto");
   }
  }
  System.out.println("Acertadas: "+acertadas);
  
  //fin
 }
}

/*opcion mejorada 
 *  HashMap<String,String> n=new HashMap<String,String>();
    
    n.put("libro","book");
    n.put("teclado","keyboard");
    n.put("pantalla","screen");
    n.put("raton","mouse");
    n.put("seven","siete");
    n.put("six","seis");
    
   ArrayList<String> h=new ArrayList<String>(n.keySet());
   int ale=0;
   int correcto=0;
   String opcion="";
   
   for(int i=0;i<5;i++) {
    ale=(int)(Math.random()*n.size());
    System.out.println("Dime la traduccion de "+h.get(ale));
    opcion=System.console().readLine();
    if(opcion.equals(n.get(h.get(ale)))) {
      correcto++;
    }
  }
  System.out.println("Has acertado: "+correcto);
  //fin
  }
}
*/
/*opcion mejorada con foreach en vez de pasarle los keyset al arraylist
 *     HashMap<String,String> n=new HashMap<String,String>();
    
    n.put("libro","book");
    n.put("teclado","keyboard");
    n.put("pantalla","screen");
    n.put("raton","mouse");
    n.put("seven","siete");
    n.put("six","seis");
    
    ArrayList<String> o=new ArrayList<String>();
   for(String a:n.keySet()) {
     o.add(a);
   }
   
   int ale=0;
   int correcto=0;
   String opcion="";
   
   for(int i=0;i<5;i++) {
    ale=(int)(Math.random()*o.size());
    System.out.println("Cual es la traduccion de "+o.get(ale));
    opcion=System.console().readLine();
    if(opcion.equals(n.get(o.get(ale)))) {
      correcto++;
    } 
  }
  System.out.print("Has acertado: "+correcto);
  //fin
  }
}
*/
