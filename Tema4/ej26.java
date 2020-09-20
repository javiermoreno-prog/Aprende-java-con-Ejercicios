import java.util.Scanner;
public class ej26 {
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("Venta de entradas CineCampa");
 System.out.println("Numero de entradas: ");
 int num=s.nextInt();
 int precioEntradas=8;
 int precioParejas=11;
 int descuento=0;
 System.out.println("Dia de la semana: ");
 String dia=s.next();
 if(dia.equals("jueves")) {
   System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
 String tarjeta=s.next();
 System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
 System.out.println("Entradas parejas: "+(num/2));
 System.out.println("Precio por entrada pareja: 11 euros");
 System.out.println("Entradas individuales: "+(num%2));
 System.out.println("Precio por entrada individual: 8 euros");
 int total=(((num/2)*precioParejas)+(num%2)*8);
 System.out.println("Total "+total);
 if(tarjeta.equals("s")) {
    descuento=3;
  }
  System.out.println("Descuento      "+descuento);
  System.out.println("A pagar        "+(total-descuento));
 } else if(dia.equals("miercoles")) {
   precioEntradas=5;
   System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
 String tarjeta=s.next();
 System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
 System.out.println("Entradas individuales   "+num);
 System.out.println("Precio por entrada: "+precioEntradas);
 int total=(num*precioEntradas);
 System.out.println("Total    "+total);
 if(tarjeta.equals("s")) {
    descuento=3;
  }
  System.out.println("Descuento      "+descuento);
  System.out.println("A pagar        "+(total-descuento));

 
 } else {
 System.out.println("¿Tiene tarjeta CineCampa? (s/n): ");
 String tarjeta=s.next();
 System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
 System.out.println("Entradas individuales   "+num);
 System.out.println("Precio por entrada: "+precioEntradas);
 int total=(num*precioEntradas);
 System.out.println("Total    "+total);
 if(tarjeta.equals("s")) {
    descuento=3;
  }
  System.out.println("Descuento      "+descuento);
  System.out.println("A pagar        "+(total-descuento));
}
}
}

