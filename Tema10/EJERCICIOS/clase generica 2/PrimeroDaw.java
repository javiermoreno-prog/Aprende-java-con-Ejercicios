public class PrimeroDaw {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Almacen<Persona> listado = new Almacen<Persona>();
    
    
    listado.aniadeArticulo(new Persona("Pepe"));
    listado.aniadeArticulo(new Persona("Antonio"));
    listado.aniadeArticulo(new Persona("Jose"));
    
    listado.dameArticulo(new Persona("Pepe")).cumpleanios();
    
    System.out.println(listado.listado());
    
    listado.ordenate();
    
    System.out.println();
    System.out.println(listado.listado());
    
  }
  
}
