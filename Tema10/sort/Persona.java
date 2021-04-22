public class Persona implements Comparable<Persona> {
  private String nombre;
  private int edad;
  
  public Persona(String m,int e) {
    this.nombre=m;
    this.edad=e;
  }
  
  //getters
  public String getNombre() {
    return this.nombre;
  }
  public int compareTo(Persona a) {
    return (this.nombre).compareTo(a.getNombre());
  }
  //toString 
  public String toString() {
    String res="";
    res+="Me llamo "+this.nombre + " y tengo " + edad;
    return res;
  }
  //fin
}
/*si quieres ordenar por edad
 * //compareTo
  public int compareTo(reor a) {
    return (this.getEdad())-(a.getEdad());
  }
  * */
