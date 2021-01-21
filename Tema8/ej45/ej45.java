public class ej45 {
public static void main(String[] args)  {

 pintar(8);
}

public static void pintar(int n) {
  int c=1;
  int lon=n*2-2;
  
  while(c<=n) {
    System.out.print(linea(n,lon,c));
    System.out.println();
    lon-=2;
    c++;
}
}
public static String linea(int n,int a,int planta) {
  String res="";
  
 for(int i=0;i<planta;i++) {
   res+="*";
 }
  for(int i=0;i<a;i++) {
   res+=" ";
  }
  for(int i=0;i<planta;i++) {
   res+="*";
 }
  
  return res;
}

//fin
}
