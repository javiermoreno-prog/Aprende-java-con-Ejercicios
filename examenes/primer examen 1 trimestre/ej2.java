import java.util.Scanner;
public class ej2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Este programa pinta piramides");
System.out.println("Introduzca la altura: ");
int altura=s.nextInt();
System.out.println("Introduzca la orientacion: ");
String orientacion=s.next();
System.out.println("Introduzca el primer caracter: ");
String c1=s.next();
System.out.println("Introduzca el segundo caracter: ");
String c2=s.next();


switch(orientacion) {
  case "arriba":
  int espacios=altura-1;
  int planta=1;
  int linea=1;
  
  while(planta<=altura) {
    //pinto espacios
    for(int i=1;i<=espacios;i++) {
      System.out.print(" ");
    }
    //pinto caracter
    int pos=1;
    for(int i=1;i<=linea;i++) {
     pos++;
     if(i%2==0) {
       System.out.print(c1);
     }
     if(i%2==1) {
       System.out.print(c2);
     }
    }
    
 System.out.println();
  planta++;
  espacios--;
  linea+=2;
}
break;
case "abajo":
 espacios=0;
   planta=1;
  linea=(altura)+(altura/2);
  
  while(planta<=altura) {
    
  //pinto espacios
  for(int i=0;i<espacios;i++) {
  System.out.print(" ");
}
  //pinto caracter
  
    int pos=1;
    for(int i=1;i<=linea;i++) {
     pos++;
     if(i%2==0) {
       System.out.print(c1);
     }
     if(i%2==1) {
       System.out.print(c2);
     }
    }
    
 System.out.println();
  planta++;
  espacios++;
  linea-=2;
}
 break; 
case "derecha":
   planta=1;
  linea=1;
  
  while(planta<=altura*2) {
    if(planta<=altura) {
      //pinto caracter
         int pos=1;
    for(int i=1;i<=linea;i++) {
     pos++;
     if(i%2==0) {
       System.out.print(c1);
     }
     if(i%2==1) {
       System.out.print(c2);
     }
    }      
   System.out.println();
   planta++;
   linea++;
 } 
  if(planta>=altura) {
   if(planta==altura) {
   linea=altura;
 }
   //pinto caracter
         int pos=1;
         
    for(int i=1;i<=linea;i++) {
     pos++;
     if(i%2==0) {
       System.out.print(c1);
     }
     if(i%2==1) {
       System.out.print(c2);
     }
    }      
   System.out.println();
   planta++;
   linea--;
  
}
}
break;
  case "izquierda":
  espacios=altura;
   planta=1;
  linea=1;
  while(planta<=altura*2) {
    if(planta<=altura) {
      //pinto espacios
      for(int i=1;i<=espacios;i++) {
        System.out.print(" ");
      }
       //pinto caracter
         int pos=1;
         
    for(int i=1;i<=linea;i++) {
     pos++;
     if(i%2==0) {
       System.out.print(c1);
     }
     if(i%2==1) {
       System.out.print(c2);
     }
    }
    System.out.println();
    planta++;
    linea++;
    espacios--;
  } 
  if(planta>=altura) {
    if(planta==altura) {
    linea=altura;
    espacios=1;
  }
   //pinto espacios
      for(int i=0;i<espacios;i++) {
        System.out.print(" ");
      }
       //pinto caracter
         int pos=1;
         
    for(int i=1;i<=linea;i++) {
     pos++;
     if(i%2==0) {
       System.out.print(c1);
     }
     if(i%2==1) {
       System.out.print(c2);
     }
    }
    System.out.println();
    planta++;
    linea--;
    espacios++;
  }           
}

 break ;
default:
}

}
}
