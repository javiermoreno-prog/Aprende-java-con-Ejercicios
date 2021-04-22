public class Carta {
  private String num;
  private String palo;
  
  public Carta(String n,String p) {
    this.num=n;
    this.palo=p;
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



  
