public class Fraccion {
  private  int numerador;
  private  int denominador;
  
  //constructor
  public Fraccion(int n,int d) {
    this.numerador=n;
    this.denominador=d;
  }
  
  //metodos
  public String invierte() {
    String res="";
    res=this.denominador + "/" + this.numerador;
   return res;
 }
 
public int multiplica() {
  int res=0;
  res=this.numerador*this.denominador;
  return res;
}
//toString
public String toString() {
  String res="";
  
  res=this.numerador + "/" + this.denominador;
  
  return res;
}
 //fin
}
