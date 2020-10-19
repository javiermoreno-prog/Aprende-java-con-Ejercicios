import java.util.Scanner;
public class ej4 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("LETRAS SIMILARES");
System.out.print("numero: ");
int n=s.nextInt();

int digito=0;
 String resultado="";
int copia=n;
int longitud=0;
while(copia>0) {
  copia/=10;
  longitud++;
}
int copia2=n;
int volteado=0;
while(copia2>0) {
  volteado=(volteado*10)+(copia2%10);
  copia2/=10;
}
for(int i=1;i<=longitud;i++) {
  digito=volteado%10;
  volteado/=10;
  switch(digito) {
    case 0:
    resultado+="O";
    break;
        case 1:
    resultado+="l";
    break; 
        case 2:
    resultado+="Z";
    break; 
        case 3:
    resultado+="E";
    break;
        case 4:
    resultado+="A";
    break;
        case 5:
    resultado+="S";
    break;
        case 6:
    resultado+="b";
    break;
        case 7:
    resultado+="J";
    break;
        case 8:
    resultado+="B";
    break;
        case 9:
    resultado+="q";
    break;
    default:
  }




}
  System.out.print(resultado);
}
}
