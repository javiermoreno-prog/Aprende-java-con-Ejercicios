
public class funciones {
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
public static String conversor(int n) {
  String res="";
  switch(n) {
    case 1: 
    res=".----";
    break;
    case 2:
    res="..---";
    break;
    case 3:
    res="...--";
    break;
    case 4:
    res="....-";
    break;
    case 5:
    res=".....";
    break;
    case 6:
    res="-....";
    break;
    case 7:
    res="--...";
    break;
    case 8:
    res="---..";
    break;
    case 9:
    res="----.";
    break;
    case 0:
    res="-----";
    break;
    default:
  }
  return res;
}

public static String morse(int n) {
  String res="";
  int dig=0;
  n=voltea(n);
  while(n>0) {
    dig=n%10;
  res+=conversor(dig) + " ";
  n/=10;
}
return res;
}
//fin
}
