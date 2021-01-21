
public class funcion {

//funciones auxiliares
public static int voltea(int x) {
  int res=0;
  
  while(x>0) {
    res+=x%10;
    x/=10;
    res*=10;
  }
  return res/10;
}

public static int digitos (int x) {
  int lon=0;
  int copia=x;
  
  while(copia>0) {
    lon++;
    copia/=10;
  }
  return lon;
}

//funcion principal
public static String convierte(int n) {
  int dig=0;
  String res="";
  
  n=voltea(n);
  int lon=digitos(n);
  for(int k=0;k<lon;k++) {
    dig=n%10;
    for(int i=0;i<dig;i++) {
      res+="|";
    }
    if(k<lon-1) {
    res+="-";
  }
    n/=10;
  }
  return res;
}

//fin
}

