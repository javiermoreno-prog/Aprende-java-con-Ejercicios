public class Elemento {
  
  private String nombre;
  private double precio;
  private int cantidad;
  
  public Elemento(String n,double p,int c) {
    this.nombre=n;
    this.precio=p;
    this.cantidad=c;
  }
  //metodos
  //getters
  public double getPrecio() {
    return this.precio;
  }
  public int getCantidad() {
    return this.cantidad;
  }
  public String getNombre() {
    return this.nombre;
  }
  //setters
  public void setCantidad(int a) {
    this.cantidad+=a;
  }
  
  //toString
  public String toString() {
    String res="";
    res=this.nombre + " "+this.precio + " "+this.cantidad + " ";
    res+=(this.precio*this.cantidad);
    return res;
  } 

  //fin
}
  
  
