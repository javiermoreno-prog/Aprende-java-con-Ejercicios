public abstract class Vehiculo {
 private static int vehiculosCreados=0;
 private static int kilometrosTotales=0;
 private int kilometrosRecorridos;
 
 //constructor
 public Vehiculo(int kmr) {
   this.kilometrosRecorridos=kmr;
   this.vehiculosCreados++;
   this.kilometrosTotales+=kmr;
 }
 //getters
 public int getKilometrosTotales() {
   return this.kilometrosTotales;
 }
 //setters
 public void aumentarTotal(int k) {
   this.kilometrosTotales+=k;
 }
 
 
 //Fin
}
