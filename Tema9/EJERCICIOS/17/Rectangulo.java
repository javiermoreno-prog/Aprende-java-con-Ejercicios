public class Rectangulo {

private int h;
private int base;
private static int contador=0;

public Rectangulo(int a,int b) {
  this.h=a;
  this.base=b;
  this.contador++;
}

//getter
public int getContador() {
  return this.contador;
}

//toString
public String toString() {
  String res="";
 
 for(int j=0;j<h;j++) {
 for(int i=0;i<base;i++) {
   res+="*";
 }
 res+="\n";
}
 return res; 
}

//fin
}
