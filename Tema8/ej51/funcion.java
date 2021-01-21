public class funcion {

public static boolean esPrimo(int n) {
  boolean es=true;
  
  for(int i=2;i<n;i++) {
    if(n%2==0) {
      es=false;
    }
  }
  return es;
}

//funcion auxiliar de volteado
public static int voltea(int x) {
  int res=0;
  
  while(x>0) {
    res+=x%10;
    x/=10;
    res*=10;
  }
  return res/10;
}

public static boolean esCapicua(int n) {
  boolean es=false;
  
  int ter=voltea(n)%10;
  
  if(n%10==ter) {
    es=true;
  }
  return es;
}

//fin
}
