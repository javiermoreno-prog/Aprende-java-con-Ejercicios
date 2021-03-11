public abstract class Terminal {
 private String numIden;
 private  int tiempo=0;
 
 public Terminal(String n) {
   this.numIden=n;
   this.tiempo=0;
 }
 //getter
 public String getNum() {
   return this.numIden;
 }
 public int getTiempo() {
   return this.tiempo;
 }
 //setter
public void setTiempo(int a) {
  this.tiempo+=a;
}
 //toString
 public String toString() {
   String res="";
   res="Nº "+ this.numIden + " - " + this.tiempo + " de conversacion";
   return res;
 }
 //metodos
 public void llamar(Terminal j,int cantidad) {
   this.tiempo+=cantidad;
   j.tiempo+=cantidad;
 }
 
 //fin
}
 
