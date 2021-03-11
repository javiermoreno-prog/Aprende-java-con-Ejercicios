public class Prueba {
public static void main(String[] args) {

int n=0;
int m=0;

FichaDomino a;

for(int i=0;i<8;i++) {
  if(i==0) {
    n=(int)(Math.random()*10);
    m=(int)(Math.random()*10);
  a=new FichaDomino(n,m);    
} else {
  n=m;
  m=(int)(Math.random()*10);
  a=new FichaDomino(n,m);    
}
System.out.print(a + " ");
}
//fin
}
}
