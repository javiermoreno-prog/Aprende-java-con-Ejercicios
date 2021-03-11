public class Caballo {
 private String color;
 private String nombre;
 private int edad;
 private boolean correr;
 
 //constructores
 public Caballo() {
   this.color="negro";
   this.nombre="rodolfo";
   this.edad=2;
   this.correr=false;
 }
 public Caballo(String n,String c,int r,boolean a) {
   this.color=n;
   this.nombre=c;
   this.edad=r;
   this.correr=a;
 }
 //getter y setter
 public String getColor() {
   return this.color;
 }
 public void setColor(String c) {
   this.color=c;
 }
 //toString
 public String toString() {
   String res="";
   
   res="Color: "+this.color +",Nombre: "+this.nombre + ",edad: "+this.edad + ",corriendo: "+this.correr;
 
 return res;
 }
 //metodos
 public void corriendo() {
   if(this.correr==false) {
     System.out.print("voy a correr");
   this.correr=true;
 } else {
   System.out.print("ya estoy corriendo");
 }

}
 
 //fin
}
