public abstract class Animal {
 private String color;
 private static String nombre;
 private int tamanio;
 
 //constructores
 public Animal() {
   this.color="rojo";
   this.nombre="?";
   this.tamanio=12;
 }
 
 public Animal(String c,String n,int t) {
   this.color=c;
   this.nombre=n;
   this.tamanio=t;
 }
 //getter y setters
 
 public String getNombre() {
   return this.nombre;
 }
 
 public void setNombre(String n) {
    this.nombre=n;
 }
 
 //fin
}
