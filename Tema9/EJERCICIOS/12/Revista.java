public class Revista extends Publicacion {
  private int num;
  
  public Revista(String i,String t,int a,int n) {
    super(i,t,a);
    this.num=n;
  }
  
  //toString
  public String toString() {
    String res="";
    res="ISBN: "+ this.getISBN() + " titulo: " + this.getTitulo() + " Año de publicacion: " + this.getAnio();
    return res;
  }

//fin
}
