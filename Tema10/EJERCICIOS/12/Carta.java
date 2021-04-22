public class Carta {
  private String num;
  private String palo;
  private String[] a = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private String[] p = {"bastos", "copas", "espadas", "oros"};
  
  public Carta() {
    this.num=a[(int)(Math.random()*a.length)];
    this.palo=p[(int)(Math.random()*p.length)];
  }
  //metodos
  //getters
  public String getNum() {
    return this.num;
  }
  public String getPalo() {
    return this.palo;
  }
  //toString
   public String toString() {
     String res=this.num + " de " + this.palo;
     return res;
   }
   //fin
 }



  
