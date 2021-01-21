public class funcion {

public static void pintar(int n) {
  int c=1;
  int anchura=n;
  
  while(c<=n) {
    System.out.println(linea(anchura));
    anchura--;
    c++;
  }
}

public static String linea(int n) {
  String res="";
  for(int i=0;i<n;i++) {
    res+="*";
  }
  return res;
}

//fin
}
 
