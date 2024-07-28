package Asignacion;

public class Asignacion {
    public static void Asignacion1(){
        int x = 10;
        x += 5;
        System.out.println(x);
    }
    public static  void Asignacion2(){
        int y = 0;
        int x= 15;
        y *= (x + 5);
        System.out.println(y);
    }
    public  static  void Asignacion3(){
        int a = 15;
        a%=4;
        System.out.println(a);
    }
    public static void  Asignacion4(){
        int x =1;
        int y=2;
        x+=y;
        System.out.println(x);
    }
    public static void Asignacion5() {
        int x = 2;
        x ^= 5;
        System.out.println("Se devuelve su valor en binario:");
        System.out.println(Integer.toBinaryString(x));
        System.out.println("Valor decimal: " + x);
    }
}
