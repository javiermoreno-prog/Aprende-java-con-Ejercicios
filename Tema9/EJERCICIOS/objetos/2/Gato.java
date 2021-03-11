public class Gato {
private int edad;
private String color;

public Gato(int e,String c) {
  this.edad=e;
  this.color=c;
}

//setter
public void setColor(String n) {
  this.color=n;
} 
//toString
public String toString() {
  String res="";
  res="Edad: "+this.edad + " ," + "Color: "+ this.color;
  return res;
}

//fin
}
