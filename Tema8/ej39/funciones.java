public class funciones {

//funcion auxiliar
public static int digitos (int x) {
  int lon=0;
  int copia=x;
  
  while(copia>0) {
    lon++;
    copia/=10;
  }
  return lon;
}
public static int voltea(int x) {
  int res=0;
  
  while(x>0) {
    res+=x%10;
    x/=10;
    res*=10;
  }
  return res/10;
}

public static String conversor(int n ) {
  String res="";
  
  switch(n) {
    case 1:
    res="uno,";
    break;
    case 2:
    res="dos,";
    break;
    case 3:
    res="tres,";
    break;
    case 4:
    res="cuatro,";
    break;
    case 5:
    res="cinco,";
    break;
    case 6:
    res="seis,";
    break;
    case 7:
    res="siete,";
    break;
    case 8:
    res="ocho,";
    break;
    case 9:
    res="nueve,";
    break;
    default:
  }
  
  return res;
}

public static String convierte(int n) {
  String res="";
  int lon=digitos(n);
  n=voltea(n);
  for(int i=0;i<lon;i++) {
    res+=conversor(n%10);
    n/=10;
  }
  return res;
}


//fin
}
