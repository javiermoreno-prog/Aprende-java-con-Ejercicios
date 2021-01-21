public class ej43 {
public static void main(String[] args)  
throws InterruptedException{
  
  pintar(8);
}

public static void pintar(int n) {
  int lon=0;
  int c=1;
  
  while(c<=n) {
  System.out.print(linea(n,lon));
  c++;
  lon++;
  System.out.println();
}
}
public static String linea(int n,int a) {
  String res="";
  
  for(int i=0;i<a;i++) {
    res+=" ";
  }
  for(int i=0;i<n-a;i++) {
    res+="*";
  }
  
  return res;
}
//fin
}
