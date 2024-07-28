package Casteo;

public class Casteo {
    public static void ejercicio1() {
        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x);
    }
    public static void ejercicio2() {
        char C = 'A';
        int IntChar = (int) C;
        System.out.println(IntChar);
    }
    public static void ejercicio3() {
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);
    }
    public static void ejercicio4() {
        String texto = "3";
        int entero =Integer.parseInt(texto);
        System.out.println(entero);
    }
    public static void ejercicio5(){
        int result = (int) (char) (byte) -1;
        System.out.println(result);
    }
    public static  void ejercicio6(){
        int numero = 65;
        char numeroChar= (char)numero;
        System.out.println(numeroChar);
    }
    public  static void ejercicio8(){
        float numeroFloat = 4.5f;
        String floatString = Float.toString((float)numeroFloat);
        System.out.println(floatString);
    }
    public  static void ejercicio9(){
        float numeroRound = Math.round(3.7);
        int IntRound = (int) numeroRound;
        System.out.println(IntRound);
    }
    public static  void ejercicio10(){
        byte b =50;
        short s = (short) b;
        System.out.println(s);
    }
}

