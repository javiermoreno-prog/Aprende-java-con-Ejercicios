public class Linea  {
 private Punto inicio;
 private Punto fina;
 
 public Linea(Punto s,Punto a) {
   this.inicio=s;
   this.fina=a;
 }
 
 //toString 
 public String toString() {
   String res="";
   res="Linea formada por los puntos ("+inicio.getIni() + ", "+inicio.getFin() + " )";
   res+= " y (" + fina.getIni() + ", "+ fina.getFin() + " )";
   return res;
 }
 
 //fin
}  

