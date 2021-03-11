public abstract class Publicacion {
private String ISBN;
private String titulo;
private int anio;

public Publicacion(String i,String t,int a) {
  this.ISBN=i;
  this.titulo=t;
  this.anio=a;
}
 //getter
 public String getISBN() {
   return this.ISBN;
 }
 public String getTitulo() {
   return this.titulo;
 }
 public int getAnio() {
   return this.anio;
 }

//fin
}
