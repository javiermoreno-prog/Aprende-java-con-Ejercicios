import java.util.Collections;
public class Articulo implements Comparable<Articulo> {
 private int cod;
 private String des;
 private int pre;
 private int preVenta;
 private int stock;
 
 public Articulo(int c,String d,int p,int pr,int s) {
   this.cod=c;
   this.des=d;
   this.pre=p;
   this.preVenta=pr;
   this.stock=s;
 }
 public int getStock() {
   return this.stock;
 }
 public void setStock(int r) {
   this.stock+=r;
 }
 public int getCodigo() {
   return this.cod;
 }
 public String getDes() {
   return this.des;
 }
 //metodos
 //toString
 public String toString() {
   String res="";
   res+="El codigo es: "+this.cod+ " ,la descripcion es: "+ this.des;
   res+=" ,el precio: "+this.pre +" ,precio de venta: "+this.preVenta + "\n";
   res+=" el stock es: "+this.stock;
   return res;
 }
 ///compareTo()
 public int compareTo(Articulo g) {
   return (this.des).compareTo(g.getDes());
 }
 /*si quieres ordenar por enteros
  * //compareTo
  public int compareTo(reor a) {
    return (this.getEdad())-(a.getEdad());
  }
  * */

 //fin
}
