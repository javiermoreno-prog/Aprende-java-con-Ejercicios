public class Movil extends Terminal {
  private String tarifa;
  private double precio=0;
  
  public Movil(String s,String t) {
    super(s);
    this.tarifa=t;
    this.precio=0;
  }
  //getter
  public String getTarifa() {
    return this.tarifa;
  }
  //setter
  public void setPrecio(double c) {
    this.precio+=c;
  }

  //toString
  public String toString() {
    String res="";
     res="Nº "+ this.getNum() + " - " + this.getTiempo() + " s de conversacion";
     res+=" - tarificados "+this.precio;
   return res;
 }
  //metodo llamar
  public void llamar(Movil j,int cantidad) {
   this.setTiempo(cantidad);
   j.setTiempo(cantidad);
   
   //swithc local
   switch(this.getTarifa()) {
     case "rata":
     this.setPrecio(((double)cantidad/60)*0.06);
     break;
     case "mono":
     this.setPrecio(((double)cantidad/60)*0.12);
     break;
     case "bisonte":
     this.setPrecio(((double)cantidad/60)*0.30);
     break;
     default:
   }
 
   
   
 }
 
 
 //Fin
}
