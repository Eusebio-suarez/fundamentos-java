package Operadores;

public class Operadores{
    public  static void Operadores1(){
        int x = 5;
        int y = ++x;
        System.out.println("el valor de X:"+x);
        System.out.println("el valor de y:"+y);
    }
    public static  void  Operadores2(){
        int a = 5;
        System.out.println("valor antes del incremento: "+(a++));
        System.out.println("valor incrementado: "+a);
    }
    public static void Operadores3(){
        int count = 10;
        System.out.println("Valor inicial de count: " + count);
        count--;
        System.out.println("Valor de count después del decremento: " + count);
    }
    public static void  Operadores4(){
        int i = 5;
        System.out.println("++i  Incrementa i antes de usarlo en la expresión ");
        System.out.println("i++ Usa el valor actual de i en la expresión y luego incrementa ");
    }
    public static  void Operadores5(){
        int x = 3;
        x = x++;
        System.out.println(x);
    }
}
