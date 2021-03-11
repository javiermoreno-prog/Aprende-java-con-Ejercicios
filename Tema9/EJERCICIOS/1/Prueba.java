public class Prueba {
  public static void main(String[] args) {
    
    boolean o=false;
    
    Caballo n=new Caballo("rojo","benancio",4,o);
    
    n.setColor("azul");
    System.out.println(n);
    
     n.corriendo();
  
    //fin
  }
}
