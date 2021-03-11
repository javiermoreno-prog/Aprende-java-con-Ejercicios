public class Libro extends Publicacion implements Prestable {
  private boolean prestado;
  
  public Libro(String i,String t,int a) {
    super(i,t,a);
    this.prestado=false;
  }
  public Libro(String i,String t,int a,boolean p) {
    super(i,t,a);
    this.prestado=p;
  }
  
  public void prestar() {
    if(this.prestado==false) {
    this.prestado=true;
   
  } else {
      System.out.println("Este libro ya se ha prestado");
  }
}
  
  public void devuelve() {
    if(this.prestado==true) {
    this.prestado=false;
   
  } else {
      System.out.println("Este libro se ha devuelto");
    }
  }
  
   public boolean estaPrestado() {
     return this.prestado;
}

//toString
 public String toString() {
    String res="";
    res="ISBN: "+ this.getISBN() + " titulo: " + this.getTitulo() + " Año de publicacion: " + this.getAnio() + " ";
     if(this.prestado==true) {
       res+="prestado";
     } else {
       res+="no prestado";
     }
    return res;
  }
  
  //fin
}
