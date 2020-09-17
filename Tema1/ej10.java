public class ej10 {
public static void main(String[] args) {
  String a="\033[31m *";
  String clear="\033[39;49m";
  
System.out.println("       *");
System.out.println("      *");
System.out.println("***************");
System.out.println("*             *");
System.out.println("*      "+a+a+clear+"   *");
System.out.println("*      "+a+a+clear+"   *");
System.out.println("*             *");
System.out.println("*             *");
System.out.println("***************");
}
}
