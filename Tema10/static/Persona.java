import java.util.HashMap;
public class Persona implements Comparable<Persona> {
  private String nombre;
  private int n;
  private static HashMap<String,Integer> o=new HashMap<String,Integer>();
  
  public Persona(String a) {
    this.nombre=a;
    this.n=0;
  }
  public String getNombre() {
    return this.nombre;
  }
  
  //comparable 
  public int compareTo(Persona r) {
    return (this.nombre).compareTo(r.getNombre());
  }
  
  //toString
  public String toString() {
    String res="";
    res="Me llamo "+this.nombre;
    return res;
  }
  //aniadir
  public static void aniadir(String a,int e) {
    Persona.o.put(a,e);
  }
  //mostrar
  public static void mostrar() {
    System.out.println(Persona.o);
  }
  //fin
}
