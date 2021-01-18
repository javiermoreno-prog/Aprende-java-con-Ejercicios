package bi;
public class ej29al34 {

public static int[][] generaArrayBi(int x,int m,int min,int max) {
  int[][] n=new int[x][m];
  
  for(int i=0;i<x;i++) {
    for(int j=0;j<m;j++) {
      n[i][j]=(int)(Math.random()*(max-min+1)+min);
    }
  }
  return n;
}
public static int[] filaDeArrayBi(int n[][],int o) {
   int[] a=new int[n.length];
   int contador=0;
   
   for(int i=0;i<n.length;i++) {
    for(int j=0;j<n[0].length;j++) {
     if(i==o) {
       a[contador]=n[i][j];
       contador++;
     }
   }
 }
 return a;
}
public static int[] columnaDeArrayBi(int n[][],int o) {
   int[] a=new int[n.length];
   int contador=0;
   
    for(int j=0;j<n[0].length;j++) {
     for(int i=0;i<n.length;i++) {
   
     if(j==o) {
       a[contador]=n[i][j];
       contador++;
     }
   }
 }
 return a;
}
public static int[] coordenadasBi(int n[][],int q) {
   
   int[] res={-1,-1};
   
    for(int j=0;j<n[0].length;j++) {
     for(int i=0;i<n.length;i++) {
       if(n[i][j]==q) {
        res[0]=i;
        res[1]=j;
       }
     }
   }
  
   return res;
 }
public static boolean esPunto(int n[][],int q) {
  boolean es=false;
 boolean es2=false;
 int min=0;
 
 //min
 for(int i=0;i<3;i++) {
    min=n[i][0];
    for(int j=0;j<3;j++) {
      
      if(n[i][j]<min) {
        min=n[i][j];
      }
    }
    if(min==q) {
    es=true;
  }
  }
  
  //max
  int max=0;
    for(int j=0;j<3;j++) {
      max=n[0][j];
     for(int i=0;i<3;i++) {
      
        if(n[i][j]>max) {
        max=n[i][j];
      }
    }
    if(max==q) {
    es2=true;
  }
  }    
 
 
 if(es2==true && es==true) {
   return true;
 } else {
   return false;
 }
}

public static int[] diagonal(int n[][],int f,int c,String di) {
  int[] a=new int[n.length];
  int contador=c-1;
  
  if(di.equals("nose")) {
  for(int i=0;i<f;i++) {
    for(int j=0;j<c;j++) {
        if(i==j) {
       a[i]=n[i][j];
     }
   }
 }
}else if(di.equals("neso")) {
  for(int i=0;i<f;i++) {
    for(int j=c-1;j>=0;j--) {
       if(j==contador) {
       a[i]=n[i][j];
     }
   }
   contador--;
 }
}
return a;
}     
//fin
}
