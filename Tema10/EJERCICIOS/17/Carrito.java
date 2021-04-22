import java.util.ArrayList;
public class Carrito {
  ArrayList<Elemento> a=new ArrayList<Elemento>();
  
  //metodos
  //agregar
  public void agrega(Elemento e) {
   a.add(e);
 }
 //numeroDeElementos
  public int numeroDeElementos() {
    return a.size();
  }
  //importeTotal
  public double importeTotal() {
    double total=0;
    for(int i=0;i<a.size();i++) {
      total+=a.get(i).getPrecio()*a.get(i).getCantidad();
    }
    return total;
  }
  //toString
  public String toString() {
    String res="";
     for(int i=0;i<a.size();i++) {
      res+=a.get(i).toString();
      res+="\n";
    }
    return res;
  }
 //fin
}
