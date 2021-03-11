public class Ameba {
  private int peso;
  
  //constructores
  public Ameba() {
    this.peso=3;
  }
  public Ameba(int p) {
    this.peso=p;
  }

  //getter
  public int getPeso() {
    return this.peso;
  }
  //setters
  public void setPeso(int n) {
    this.peso=n;
  }
  
  //toString
  public String toString() {
    String res="";
    res="Soy una ameba y peso "+ this.peso + " microgramos";
    return res;
  }
  
  //funciones
  public void comer(int comida) {
    this.setPeso(comida-1+this.getPeso());
  }
  

  public void comer(Ameba j) {
    this.setPeso(j.getPeso()-1+this.getPeso());
    j.setPeso(0);
  }
  
  //fin
}

