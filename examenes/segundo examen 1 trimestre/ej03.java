import java.util.Scanner;
public class kdise {
public static void main(String[] args)  {
  Scanner s=new Scanner(System.in);
 System.out.println("Dime un numero: ");
 int numero=s.nextInt();
 
 
 String respuesta="";
 int volteado=0;
 int copia=numero;
 int longitud=0;
 
 while(copia>0) {
   volteado=(volteado*10)+(copia%10);
   copia/=10;
  longitud++;
 }
 if(volteado==0) {
   System.out.print("-----");
 }
 for(int i=1;i<=longitud;i++) {
   int digito=volteado%10;
   switch(digito) {
     case 1:
     respuesta+=".----";
     break;  
     case 2:
     respuesta+="..---";
     break;  
     case 3:
     respuesta+="...--";
     break;  
     case 4:
     respuesta+="....-";
     break;  
     case 5:
     respuesta+=".....";
     break;  
     case 6:
     respuesta+="-....";
     break;  
     case 7:
     respuesta+="--...";
     break;  
     case 8:
     respuesta+="---..";
     break;  
     case 9:
     respuesta+="----.";
     break;  
     case 0:
     respuesta+="-----";
     break;
     default:
   }
   volteado/=10;
   
   }
System.out.print(respuesta);


}
}
