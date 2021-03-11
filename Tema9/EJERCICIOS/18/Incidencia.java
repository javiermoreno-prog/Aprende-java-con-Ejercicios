public class Incidencia {
  private int cod;
  private String error;
  private static int contador=0;
  private String arre="Pendiente";
  
  public Incidencia(int n,String s) {
    this.cod=n;
    this.error=s;
    this.contador++;
    this.arre="Pendiente";
  }
  //getter
  public int getContador() {
    return this.contador;
  }
  //toString
  public String toString() {
    String res="";
    res="Incidencia "+this.contador + "-Puesto: "+this.cod + " - " + this.arre + " - " +  this.error;
    return res;
  }
  //metodos
  public void resuelve(String n) {
    this.arre="Arreglado";
    this.error+=n;
    this.contador--;
  }
  
  //fin
}
