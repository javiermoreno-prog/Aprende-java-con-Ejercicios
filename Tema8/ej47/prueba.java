public class prueba {
public static void main(String[] args)  {

int[] a=new int[10];

for(int i=0;i<10;i++) {
  a[i]=(int)(Math.random()*100);
}

String n=funciones.convierteEnString(a);
System.out.print(n);


//fin 
}
}
