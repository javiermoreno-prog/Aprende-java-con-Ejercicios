public abstract class Ave {

private boolean poner;
private boolean volar;
private boolean aparcar;


public Ave() {
  this.poner=false;
  this.volar=false;
  this.aparcar=false;
}

//metodos
public void ponerHuevo() {
  if(this.poner==false) {
  this.poner=true;
  System.out.println("He puesto un huevo");
} else {
   System.out.println("No");
}
}

public void volar() {
  if(this.volar==false) {
  this.volar=true;
  System.out.println("Vuelo");
} else {
   System.out.println("No");
}
}

public void aparcar() {
  if(this.aparcar==false) {
  this.aparcar=true;
  this.volar=false;
  System.out.println("Desciendo");
} else {
   System.out.println("No");
}
}



//fin
}
