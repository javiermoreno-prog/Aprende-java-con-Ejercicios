public class Canario extends Ave {

private String cantar;

public Canario() {
  super();
  cantar="";
}

//metodo
public String cantar(String letra) {
 this.cantar+=letra;
 return this.cantar;
} 

//fin
}
