public class ej5 {
  public static void main(String[] args) {
    
   Articulo[] total=new Articulo[5];
   
    for(int i=0;i<3;i++) {
      total[i]=new Articulo(i,"s",i,i,i);
    }
    
  boolean salir=false;
  String opcion="";
  int contador=3;
  int codigo=0;
  String des="";
  int pre=0;
  int vent=0;
  int stock=0;
  int cantidad=0;
  
  
  do {
    System.out.print("Dime orden: ");
    opcion=System.console().readLine();
    
    switch(opcion) {
      case "listado":
      for(int i=0;i<contador;i++) { 
        System.out.println(total[i]);
      }
      break;
      case "alta":
           
      if(contador>=total.length) {
        System.out.print("No no no no ");
      } else {
        System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.print("Dime descrip: ");
        des=System.console().readLine();
         System.out.print("Dime precio: ");
         pre=Integer.parseInt(System.console().readLine());
         System.out.print("Dime venta: ");
        vent=Integer.parseInt(System.console().readLine());
         System.out.print("Dime stock: ");
        stock=Integer.parseInt(System.console().readLine());
   
        total[contador]=new Articulo(codigo,des,pre,vent,stock);
        contador++;
      }
       break;
       case "baja":
       System.out.print("Dime el codigo: ");
       codigo=Integer.parseInt(System.console().readLine());
       total[codigo]=new Articulo(0,"",0,0,0);
       if(codigo<contador) {
         for(int i=codigo;i<contador;i++) {
           total[i]=total[i+1];
         }
       }
       break;
       case "modificacion":
         System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.print("Dime descrip: ");
        des=System.console().readLine();
         System.out.print("Dime precio: ");
         pre=Integer.parseInt(System.console().readLine());
         System.out.print("Dime venta: ");
        vent=Integer.parseInt(System.console().readLine());
         System.out.print("Dime stock: ");
        stock=Integer.parseInt(System.console().readLine());
        total[codigo]=new Articulo(codigo,des,pre,vent,stock);
        break;
        case "salir":
        salir=true;
        break;
        case "entrada":
        System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.println("Dime cantidad: ");
        cantidad=Integer.parseInt(System.console().readLine());
        total[codigo].setStock(cantidad);
        break;
        case "salida":
        System.out.print("Dime codigo: ");
        codigo=Integer.parseInt(System.console().readLine());
        System.out.println("Dime cantidad: ");
        cantidad=Integer.parseInt(System.console().readLine());
        if(cantidad<total[codigo].getStock()) {
        cantidad*=-1;
        total[codigo].setStock(cantidad);
      }
      break;
      default: 
    }
    
  } while(salir==false);
    
    
    //fin
  }
}
