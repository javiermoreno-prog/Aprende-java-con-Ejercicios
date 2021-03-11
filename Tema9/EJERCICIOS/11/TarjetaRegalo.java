public class TarjetaRegalo {
  private double saldo;
  private long iden;
  
  public TarjetaRegalo(double s) {
    this.saldo=s;
    this.iden=(long)(Math.random()*99999)+10000;
  
}
  
  //toString
  public String toString() {
    String res="";
    res="Tarjeta nº "+ this.iden + "- Saldo " + this.saldo;
    return res;
  }
  
  //metodos
  public void gastar(int c) {
    this.saldo-=c;
  }
  public TarjetaRegalo fusionar(TarjetaRegalo j) {
    double suma=0;
    suma=this.saldo+j.saldo;
    this.saldo=0;
    j.saldo=0;
    TarjetaRegalo res=new TarjetaRegalo(suma);
    return res;
  }
  //fin
}
