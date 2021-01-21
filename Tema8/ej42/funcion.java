public class funcion {


public static void pintar(int n) {
 int c=1;
 int anchura=n-2;
 
 //primera linea
 for(int i=0;i<n;i++) {
   System.out.print("*");
 }
 System.out.println();
 
 while(c<=n) {
 System.out.println(linea(c,anchura));
 anchura--;
 c++;
}

}


public static String linea(int n,int an) {
  String res="*";
  
  for(int i=0;i<an;i++) {
    res+=" ";
  }
  if(an>=0) {
  res+="*";
}
  
  return res;
}

//Fin
}

