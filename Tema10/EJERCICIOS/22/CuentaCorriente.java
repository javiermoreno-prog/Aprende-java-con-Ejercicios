import java.util.ArrayList;
public class CuentaCorriente {

private long numCuen;
private long saldo;
private ArrayList<String> mov;
//constructores;
public CuentaCorriente() {
  //numCuen
  for(int i=0;i<10;i++) {
    this.numCuen+=(int)(Math.random()*10);
    this.numCuen*=10;
  }
  //saldo
  this.saldo=0;
  //arraylist
  mov=new ArrayList<String>();
}

public CuentaCorriente(int n) {
  //numCuen
  /*for(int i=0;i<10;i++) {
    this.numCuen+=(int)(Math.random()*10);
    this.numCuen*=10;
  }*/
  this();
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
  mov.add("Ingreso"+n +  "Saldo: "+this.saldo);
}
public void cargo(int n) {
  this.saldo-=n;
    mov.add("Cargo "+n + " $ Saldo: "+this.saldo);
}
public void transferencia(CuentaCorriente c, int n) {
  this.saldo-=n;
  c.saldo+=n;
  
}

public void movimientos() {
  System.out.println("Movimientos de la cuenta: "+this.numCuen);
  System.out.println("-------------------------------");
  for(int i=0;i<mov.size();i++) {
    System.out.println(mov.get(i));
  }
}
//fin
}
