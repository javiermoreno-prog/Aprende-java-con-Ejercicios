public class ej46 {
public static void main(String[] args)  {

 pintar(8);
}

public static void pintar(int n) {
  int c=1;
  int lon=n*2-2;
  
  while(c<=n-1) {
    System.out.print(linea(n,lon,c));
    System.out.println();
    lon-=2;
    c++;
}
for(int i=0;i<n*2;i++) {
  System.out.print("*");
}
}
public static String linea(int n,int a,int planta) {
  String res="";
  
 for(int i=0;i<planta;i++) {
   if(i==0 || i==planta-1) {
     res+="*";
   } else {
     res+=" ";
   }
 }
  for(int i=0;i<a;i++) {
   res+=" ";
  }
  
  for(int i=0;i<planta;i++) {
   if(i==0 || i==planta-1) {
     res+="*";
   } else {
     res+=" ";
   }
 }
   
  return res;
}

//fin
}
