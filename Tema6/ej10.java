import java.util.Scanner;
public class ej10 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
for(int j=1;j<=10;j++) {
int aleatorio=(int)(Math.random()*6)+1;

String caracter="";

switch(aleatorio) {
 case 1:
 caracter="*";
 break;
 case 2:
 caracter="-";
 break;
 case 3:
 caracter="=";
 break;
 case 4:
 caracter=".";
 break;
 case 5:
 caracter="|";
 break;
 case 6:
 caracter="@";
 break;
 default:
}

 int aleatorio2=(int)(Math.random()*40)+1;
 
for(int i=1;i<=aleatorio2;i++) {
System.out.print(caracter);
}
System.out.println();
  
}
}
}
