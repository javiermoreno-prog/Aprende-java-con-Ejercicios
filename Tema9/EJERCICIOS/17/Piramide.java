public class Piramide {

private int h;
private static int contador=0;

public Piramide(int a) {
  this.h=a;
  this.contador++;
}

//getter
public int getContador() {
  return this.contador;
}

//toString
public String toString() {
  String res="";
  int espacios=this.h-1;
  int planta=1;
  int linea=1;
  
  while(planta<=this.h) {
    //espacios
    for(int i=0;i<espacios;i++) {
      res+=" ";
    }
    //caracter
    for(int j=0;j<linea;j++) {
      res+="*";
    }
    res+="\n";
    planta++;
    linea+=2;
    espacios--;
  }
  return res;
}

//fin
}
