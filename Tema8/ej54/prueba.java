public class prueba {
public static void main(String[] args)  {

int n=funcion.ocurrencias(1,12341);

int[] d=new int[10];

for(int i=0;i<10;i++) {
  d[i]=(int)(Math.random()*100);
  System.out.print(d[i] + " ");
}
System.out.println();

int l=funcion.ocurrencias(1,d);

System.out.println(l);

//fin
}
}
