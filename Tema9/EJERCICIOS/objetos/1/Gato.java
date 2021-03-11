public class Gato {
private int edad;
private String color;

public Gato(int e,String c) {
  this.edad=e;
  this.color=c;
}
//toString
public String toString() {
  String res="";
  res="Edad: "+this.edad + " ," + "Color: "+ this.color;
  return res;
}

//fin
}
