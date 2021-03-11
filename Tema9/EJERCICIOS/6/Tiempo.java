public class Tiempo {

 private int horas;
 private int min;
 private int seg;
 
 public Tiempo(int h,int m,int s) {
   this.horas=h;
   this.min=m;
   this.seg=s;
 }
 //getter
 public int getHoras() {
   int res=0;
   res=this.horas;
   return res;
 }
 //metodos
 public void suma(Tiempo j,Tiempo s) {
   //segundos
   int h=j.seg;
   int o=s.seg;
   int llevado=0;
   int sumaS=h+o;
   if(sumaS<60) {
     sumaS=sumaS;
   } else {
     //contar los llevados
     for(int i=0;i<sumaS;i+=60) {
       llevado++;
     }
     llevado-=1;
     //restamos
     sumaS=sumaS-llevado*60;
   }
   //minutos
    int hm=j.min;
   int om=s.min;
   int llevado2=0;
   int sumaM=hm+om;
   if(sumaM+llevado<60) {
     sumaM=sumaM;
   } else {
     //contar los llevados
     for(int i=0;i<sumaM;i+=60) {
       llevado2++;
     }
     llevado2-=1;
     //restamos
     sumaM=sumaM-llevado2*60;
     
   }
  
   //horas
   int kh=j.horas;
   int oh=s.horas;
   int total=kh+oh+llevado2;
    System.out.print("horas: "+total + " minutos: " + sumaM + " segundos "+sumaS);
     //fin suma
 }
 
 //resta
 public void resta(Tiempo j,Tiempo s) {
   //segundos
   int sj=j.seg;
   int ss=s.seg;
   int llevados=0;
   int resta=sj-ss;
   int copia=resta;
   if(resta<0) {
     resta=sj-ss;
     copia*=-1;
     //calcular los llevados
     for(int i=0;i<copia;i+=60) {
       llevados++;
     }
     llevados--;
     resta=60*llevados+resta;
     resta*=-1;
   } else {
     resta=sj-ss;
   }
   //minutos
   int mj=j.min;
   int ms=s.min;
   int llevados2=0;
   int resta2=mj-ms;
   resta2+=llevados;
    copia=resta2;
   if(resta2<0) {
     resta2=mj-ms;
     copia*=-1;
     //calcular los llevados
     for(int i=0;i<copia;i+=60) {
       llevados2++;
     }
     llevados2--;
     resta2=60*llevados2+resta2;
     resta2*=-1;
   } else {
     resta2=mj-ms;
   }
   //horas
   int hj=j.getHoras();
   int hs=s.getHoras();
   int totalHoras=hj-hs+llevados2;
   System.out.print("horas: "+totalHoras + " minutos: "+resta2+ "segundos: "+resta);
     //System.out.print(hj + "-" + hs + "-" + llevados2);
   
   }
 
 //fin
}
