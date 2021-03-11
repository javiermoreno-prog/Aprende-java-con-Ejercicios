public class Disco {
 private String codigo;
 private String autor;
 private String titulo;
 private String genero;
 private int duracion;
 
 //constructores
 public Disco(String c,String a,String t,String g,int d) {
   this.codigo=c;
   this.autor=a;
   this.titulo=t;
   this.genero=g;
   this.duracion=d;
 }
 public Disco() {
   this.codigo="no existe";
   this.autor="no existe";
   this.titulo="vacio";
   this.genero="vacio";
   this.duracion=0;
 }
 //getters
 public String getCodigo() {
   return this.codigo;
 }
 
  public String getAutor() {
   return this.autor;
 }
 
  public String getTitulo() {
   return this.titulo;
 }
 
  public String getGenero() {
   return this.genero;
 }
 
  public int getDuracion() {
   return this.duracion;
 }
 
 //toString
 public String toString() {
  String res="";
   
   res+="Codigo: "+this.codigo + " " ;
   res+="Autor: "+this.autor + " ";
   res+="Titulo: "+this.titulo + " ";
   res+="Genero: "+this.genero + " ";
   res+="Duracion: "+this.duracion + " ";
   
   return res;
 }
 //fin
}
