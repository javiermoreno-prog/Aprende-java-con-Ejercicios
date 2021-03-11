public class CuentaCorriente {

private long numCuen;
private long saldo;

//constructores;
public CuentaCorriente() {
  //numCuen
  for(int i=0;i<10;i++) {
    this.numCuen+=(int)(Math.random()*10);
    this.numCuen*=10;
  }
  //saldo
  this.saldo=0;
}

public CuentaCorriente(int n) {
  //numCuen
  for(int i=0;i<10;i++) {
    this.numCuen+=(int)(Math.random()*10);
    this.numCuen*=10;
  }
  //saldo
  this.saldo=n;
}

//toString
public String toString() {
  String res="";
  res="Numero de cta: "+this.numCuen + " Saldo: "+this.saldo;
  return res;
}
//metodos
public void ingreso(int n) {
  this.saldo+=n;
}
public void cargo(int n) {
  this.saldo-=n;
}
public void transferencia(CuentaCorriente c, int n) {
  this.saldo-=n;
  c.saldo+=n;
}

//fin
}
