public class Prueba {
  public static void main(String[] args) {
    
 Ameba a=new Ameba();
 Ameba b=new Ameba(4);
 
 
 System.out.println(a);   
 System.out.println(b);   
    
  a.comer(4);
  
  
  System.out.println(a);
  
  
  b.comer(a);
     System.out.println(a);   
 System.out.println(b);  
  //fin
  }
}
