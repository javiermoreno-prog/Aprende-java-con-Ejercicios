public class Pizza {
private tamanio tam;
private String tipo;
private estado esta;
private static int total=0;
private static int servido=0;
private boolean pedida;

public Pizza(tamanio t,String a,estado est) {
  tam=t;
  this.tipo=a;
  esta=est;
  pedida=false;
  total++;
}
//getters y setters
public int getTotal() {
  return this.total;
}
public int getServido() {
  return this.servido;
}

public tamanio getTam() {
  return tam;
}
//toString
public String toString() {
  String res="";
  
  res="Pizza" + tipo + " " + tam + " " + ", " + pedida;
  
  return res;
}
//metodos
public void servir() {
  this.pedida=true;
  servido++;
} 
//fin
}
