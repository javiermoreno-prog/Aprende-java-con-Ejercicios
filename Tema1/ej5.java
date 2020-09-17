public class ej5 {
public static void main(String[] args) {
 String a="\033[31m PROG";
 String b="\033[32m BDATO";
 String c="\033[33m ED";
 String d="\033[34m FOL";
 String e="\033[31m SIN";
 String f="\033[31m LM";

System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
System.out.println("======\t=======\t======\t=======\t=======");
System.out.println(a + "\t"+ b +"\t"+ c +"\t"+d+"\t"+e);
System.out.println(b + "\t"+ a +"\t"+ d +"\t"+e+"\t"+a);
System.out.println(a + "\t"+ b +"\t"+ c +"\t"+d+"\t"+e);
System.out.println(a + "\t"+ b +"\t"+ a +"\t"+c+"\t"+d);
}
}
