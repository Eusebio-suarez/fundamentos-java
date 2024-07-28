package Combinados;

public class Combinados {
    public static void Combinado1(){
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println(i);
    }
    public static void Combinado2(){
        double doubleValue = 9.99;
        int intValue = (int) doubleValue;
        System.out.println("Valor inicial (double): " + doubleValue);  // Imprimirá 9.99
        System.out.println("Valor convertido (int): " + intValue);     // Imprimirá 9
        intValue++;
        System.out.println("Valor después del incremento: " + intValue); // Imprimirá 10
    }
    public static void combinado3(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--);
    }
    public static void  Combinado4(){
        int intValue = 10;
        double doubleValue = 0.0;
        doubleValue += (double) intValue / 2.0;
        System.out.println("Resultado: " + doubleValue);  // Imprimirá 5.0
    }
    public static  void  Combinado5(){
        char c = 'X';
        c += 32;
        System.out.println(c);
        System.out.println("el resultado es X ya que no se a pasado de char a int");
    }
    public static void Combinado6(){
        long longValue = 100L;
        short shortValue = (short) longValue;
        System.out.println("Valor convertido (short): " + shortValue);
        shortValue *= 3;
        System.out.println("Valor después de multiplicar por 3: " + shortValue);
    }
    public static void Combinados7(){
        int x = 10;
        x += (x++) + (++x);
        System.out.println(x);
    }
    public static  void combinado8(){
        float floatValue = 123.45f;
        byte byteValue = (byte) floatValue;
        System.out.println("Valor inicial (float): " + floatValue);
        System.out.println("Valor convertido (byte): " + byteValue);
        --byteValue;
        System.out.println("Valor después del predecremento: " + byteValue); // Imprimirá 122
    }
    public static void Combinado9(){
        int i = 257;
        byte b = (byte)i;
        System.out.println(b);
        System.out.println("se genera ese resultado ya que hay un desbordamiento");
    }
    public static  void Combinado10(){
        double doubleValue = 7.89;
        int intValue = (int) doubleValue;
        intValue += 5;
        intValue++;
        System.out.println("Resultado final: " + intValue);
    }
}
