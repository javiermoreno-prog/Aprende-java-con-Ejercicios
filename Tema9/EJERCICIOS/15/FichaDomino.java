public class FichaDomino {
  private int d1;
  private int d2;
  
  public FichaDomino(int u,int d) {
    this.d1=u;
    this.d2=d;
  }
  
  //toString
  public String toString() {
    String res="";
    res="["+this.d1 + "|" + this.d2 + "]";
    return res;
  }
  //metodos
  public FichaDomino voltea() {
    FichaDomino n=new FichaDomino(d2,d1);
    return n;
  }
  
  public boolean encaja(FichaDomino j) {
   boolean ok=false;
     //comparamos d1
     if(d1==j.d1 || d1==j.d2) {
       ok=true;
     }
     //comparamos d2
    if(d2==j.d1 || d2==j.d2) {
       ok=true;
     }
     return ok;
   }
  
  //fin
}
