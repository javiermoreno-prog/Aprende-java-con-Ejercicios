public class Carta implements Comparable<Carta> {
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
   //sort
   public int compareTo(Carta c) {
     if(this.palo.equals(c.getPalo())) {
       return this.num.compareTo(c.getNum());
     } else {
       return this.palo.compareTo(c.getPalo());
     }
   }
   //fin
 }



  
