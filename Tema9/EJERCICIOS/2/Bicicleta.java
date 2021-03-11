public class Bicicleta extends Vehiculo {
 private int klocal;
 private boolean caba;
 
 //constructor
 public Bicicleta(int kmr) {
   super(kmr);
   klocal=kmr;
   caba=false;
 }
 //getter
 public int getKloca() {
   return this.klocal;
 }
  //metodos
  public void caballito() {
    if(this.caba==false) {
      this.caba=true;
        System.out.println("Voy");
    } else {
      System.out.println("Ya lo estoy haciendo");
    }
    
  }
  public void andar(int km) {
   klocal+=km;
   aumentarTotal(km);
 }

//fin
}
