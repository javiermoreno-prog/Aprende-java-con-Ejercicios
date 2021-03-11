public class GatoSimple {
 String raza;
 String sexo;
 int edad;
 double peso;
 String color;
 
 //constructor
 GatoSimple (String s) {
   this.sexo=s;
 }
 
 //getter
 String getSexo() {
   return this.sexo;
 }
 //metodos
 void maulla() {
   System.out.println("Miauu");
 }
 void ronronea() {
 System.out.println("mrrrrrr");
 }
 void come(String comida) {
   if(comida.equals("pescado")) {
     System.out.println("okey");
   } else {
     System.out.println("no");
   }
 }
 void peleaCon(GatoSimple contrincante) {
  if (this.sexo.equals("hembra")) {
  System.out.println("no me gusta pelear");
  } else {
   if (contrincante.getSexo().equals("hembra")) {
   System.out.println("no peleo contra gatitas");
  } else {
   System.out.println("ven aquí que te vas a enterar");
   }
  }
 }


 
 //fin
}
