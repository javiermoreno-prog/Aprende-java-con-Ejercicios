import java.util.Scanner;
public class ej1al14 {

public static int voltea(int x) {
  int lon=0;
  int copia=x;
  int resultado=0;
  
  while(copia>0) {
    copia/=10;
    lon++;
  }
  for(int i=0;i<lon;i++) {
    resultado+=x%10;
    resultado*=10;
    x/=10;
  }
  resultado/=10;
  return resultado;
  
}

public static boolean esCapicua(int x) {
  boolean es=false;
  int ultimo=x%10;
  int volteado=voltea(x);  
  if(ultimo==volteado%10) {
    es=true;
  }
  return es;
}
  
public static boolean esPrimo(int x) {
  boolean es=true;
  
  for(int i=2;i<x;i++) {
    if(x%i==0) {
      es=false;
    }
  }
  return es;
}

public static int siguientePrimo(int x) {
  int resultado=0;
  boolean esP=false;
  
  for(int i=x;i<10000;i++) {
    if(esP==false) {
   if(esPrimo(i)==true) {
     esP=true;
     resultado=i;
   }
 }
}
return resultado;
}

public static int potencia (int x,int d) {
  return (int)(Math.pow(x,d));
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
public static int digitoN(int x,int n) {
  int copia=x;
  copia=voltea(x);
  int resultado=0;
  for(int i=0;i<n;i++) {
    resultado=copia%10;
    copia/=10;
  }
  return resultado;
}
public static int posicionDeDigito(int a,int n) {
  int pos=-1;
  int longitud=digitos(a);
  int copia=a;
  
  for(int i=1;i<=longitud;i++) {
    if(a%10==n) {
     pos=i;
   }
   a/=10;
 }
 return pos;    
}
public static int quitaPorDetras(int x,int n) {
  int resultado=x;
  
  return resultado / (int)potencia(10,n);
}
public static int quitaPorDelante(int x,int n) {
  int resultado=x;
  
  resultado=voltea(resultado);
  
  
  return quitaPorDetras(resultado,n);
}
public static int pegaPorDetras(int x,int d) {
  int resultado=x;
  
  resultado=(resultado*10)+d;
  
  return resultado;
}
public static int pegaPorDelante(int x,int d) {
  int resultado=x;
  
  resultado=voltea(resultado);
  
  return pegaPorDetras(resultado,d);
}

public static int trozoDeNumero(int x,int in,int fi) {
  int resultado=x;
  int devuelta=0;
  
  
  for(int i=0;i<=fi;i++) {
    if(i!=in && i!=fi) {
      devuelta+=resultado%10;
      devuelta*=10;
      resultado/=10;
    } else {
      System.out.print("");
      resultado/=10;
    }
  }
  devuelta/=10;
  return devuelta;
}
public static int juntaNumeros(int x,int n) {
  int longitud=digitos(n);
  int resultado=n;
  
  n=voltea(n);
  
  for(int i=0;i<longitud;i++) {
   resultado=n%10;
   n/=10;
   x*=10;
   x+=resultado;
  }
  return x;
}
//fin
}
