public class Prueba {
  public static void main(String[] args) {
    
    Gato[] n=new Gato[3];
    String[] color={"rojo","verde","azul"};
    int[] edad={1,2,3};
    
    for(int i=0;i<3;i++) {
     n[i]=new Gato(edad[i],color[i]);
    // n[i].setColor("marron");
    }
      
    for(int i=0;i<3;i++) {
      System.out.println(n[i]);
    }
    
    //fin
  }
}
