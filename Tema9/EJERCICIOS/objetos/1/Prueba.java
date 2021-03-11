public class Prueba {
 public static void main(String[] args) {
   
   Gato[] n=new Gato[3];
   
   n[0]=new Gato(3,"h");
   n[1]=new Gato(4,"e");
   n[2]=new Gato(5,"r");
   
   for(int i=0;i<3;i++) {
     System.out.println(n[i]);
   }
   //fin
 }
}
