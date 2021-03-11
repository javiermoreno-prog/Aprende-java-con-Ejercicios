public class Coche extends Vehiculo {
 private int klocal;
 
 //constructor
 public Coche(int kmr) {
   super(kmr);
   klocal=kmr;
 }
 //getter
 public int getKlocal() {
   return this.klocal;
 }
 //metodos
 public void andar(int km) {
   klocal+=km;
   aumentarTotal(km);
 }
 
 
 

//fin
}
