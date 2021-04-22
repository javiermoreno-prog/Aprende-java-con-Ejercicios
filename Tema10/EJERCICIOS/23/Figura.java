public class Figura {
  private String nombre;
  private int valor;
  private int cantidad;
  
  public Figura(String n,int v,int c) {
    this.nombre=n;
    this.valor=v;
    this.cantidad=c;
  }
  
  public boolean esCapturable() {
return this.cantidad > 0;
}
public void captura() {
this.cantidad--;
}
@Override
public String toString() {
return nombre + " (" + valor + (valor == 1 ? " peón)" : " peones)");
}
public int getValor() {
return valor;
}
}

/*mejorado
 * public class Figura {
 private String[] t={"Dama","Torre","Alfil","Caballo","Peon"};
 private int[] valores={9,5,3,2,1};
 private int[] cantidades={1,2,2,2,8};
 private String nombre;
 private int cantidad;
 private int valor;
 private int ale=(int)(Math.random()*valores.length);
 
 public Figura() {
  
   this.nombre=t[ale];
   this.cantidad=valores[ale];
   this.valor=cantidades[ale];
  
   
  }
  
   public Figura(String a,int r,int b) {
  
   this.nombre=a;
   this.cantidad=b;
   this.valor=r;
  }  
  //metodos
  public int getCantidad() {
    return cantidad;
  }
  
  public void setCantidad() {
    this.cantidad--;
  }
  
  public int getValor() {
    return this.valor;
  }
  public String toString() {
    String res="";
    res+=this.nombre + " ("+this.valor + " )" + this.cantidad;
    return res;
  }
  //fin
}
*/
