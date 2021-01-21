public class ej44 {
   public static void main(String[] args)  {
     
     pintar(8);
     
   }
   public static void pintar(int n) {
     int lon=0;
     int c=1;
     for(int i=0;i<n;i++) {
       System.out.print("*");
     }
     System.out.println();
     while(c<=n-1) {
       System.out.println(linea(n,lon));
       c++;
       lon++;
     }
     
   }
   public static String linea(int m,int a) {
     String res="";
     
     for(int i=0;i<a;i++) {
       res+=" ";
     }
      res+="*";
     for(int i=0;i<m-(a+2);i++) {
       res+=" ";
     }
     res+="*";
     
     return res;
   }

//fin
}
