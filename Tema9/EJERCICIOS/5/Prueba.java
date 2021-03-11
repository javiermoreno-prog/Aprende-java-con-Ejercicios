public class Prueba {
public static void main(String[] args) {

Pizza n=new Pizza(tamanio.MEDIANO,"margarita",estado.PEDIDO);
Pizza a=new Pizza(tamanio.PEQUENIO,"funghi",estado.PEDIDO);

a.servir();
Pizza b=new Pizza(tamanio.GRANDE,"cuatro quesos",estado.PEDIDO);
System.out.println(n);
System.out.println(a);
System.out.println(b);

System.out.println("pedidas: "+ a.getTotal());
System.out.println("servidas: "+ n.getServido());
//fin
}
}
