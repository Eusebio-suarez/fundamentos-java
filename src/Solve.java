import java.util.Scanner;
import Casteo.* ;
import Asignacion.*;
import Operadores.*;
import Combinados.*;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String menu =
                "Menú de Ejercicios:\n" +
                        "1. Casteo\n" +
                        "2. Asignacion\n" +
                        "3. Incremento y Decremento\n" +
                        "4. Combinados\n" +
                        "0. Salir\n" +
                        "Elige una opción: ";
        String menucasteo =
                "Menú de Casteo:\n" +
                        "1. Ejercicio 1\n" +
                        "2. Ejercicio 2\n" +
                        "3. Ejercicio 3\n" +
                        "4. Ejercicio 4\n" +
                        "5. Ejercicio 5\n" +
                        "6. Ejercicio 6\n" +
                        "7. Ejercicio 7\n" +
                        "8. Ejercicio 8\n" +
                        "9. Ejercicio 9\n" +
                        "10.Ejercicio 10\n" +
                        "0. Salir\n" +
                        "Elige una opción: ";
        String menuAsignacion =
                "Menú de Asignacion:\n" +
                        "1. Ejercicio 1\n" +
                        "2. Ejercicio 2\n" +
                        "3. Ejercicio 3\n" +
                        "4. Ejercicio 4\n" +
                        "5. Ejercicio 5\n" +
                        "0. Salir\n" +
                        "Elige una opción: ";
        String menuOperadores =
                "Menú de Operadores:\n" +
                        "1. Ejercicio 1\n" +
                        "2. Ejercicio 2\n" +
                        "3. Ejercicio 3\n" +
                        "4. Ejercicio 4\n" +
                        "5. Ejercicio 5\n" +
                        "0. Salir\n" +
                        "Elige una opción: ";
        String menuCombinados =
                "Menú de Combinados:\n" +
                        "1. Ejercicio 1\n" +
                        "2. Ejercicio 2\n" +
                        "3. Ejercicio 3\n" +
                        "4. Ejercicio 4\n" +
                        "5. Ejercicio 5\n" +
                        "6. Ejercicio 6\n" +
                        "7. Ejercicio 7\n" +
                        "8. Ejercicio 8\n" +
                        "9. Ejercicio 9\n" +
                        "10.Ejercicio 10\n" +
                        "0. Salir\n" +
                        "Elige una opción: ";
        do {
            System.out.println(menu);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(menucasteo);
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            Casteo.ejercicio1();
                            break;
                        case 2:
                            Casteo.ejercicio2();
                            break;
                        case 3:
                            Casteo.ejercicio3();
                            break;
                        case 4:
                            Casteo.ejercicio4();
                            break;
                        case 5:
                            Casteo.ejercicio5();
                            break;
                        case 6:
                            Casteo.ejercicio6();
                            break;
                        case 7:
                            System.out.println(" sin hacer un casting explícito, el código no se compilará y se genera un error de compilacion");
                            break;
                        case 8:
                            Casteo.ejercicio8();
                            break;
                        case 9:
                            Casteo.ejercicio9();
                            break;
                        case 10:
                            Casteo.ejercicio10();
                            break;
                        default:
                            option = 0;
                            break;
                    }
                    break;
                case 2:
                    System.out.println(menuAsignacion);
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            Asignacion.Asignacion1();
                            break;
                        case 2:
                            Asignacion.Asignacion2();
                            break;
                        case 3:
                            Asignacion.Asignacion3();
                            break;
                        case 4:
                            Asignacion.Asignacion4();
                            break;
                        case 5:
                            Asignacion.Asignacion5();
                            break;
                        default:
                            option = 0;
                            break;
                    }
                    break;
                case 3:
                    System.out.println(menuOperadores);
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            Operadores.Operadores1();
                            break;
                        case 2:
                            Operadores.Operadores2();
                            break;
                        case 3:
                            Operadores.Operadores3();
                            break;
                        case 4:
                            Operadores.Operadores4();
                            break;
                        case 5:
                            Operadores.Operadores5();
                            break;
                        default:
                            option = 0;
                            break;
                    }
                    break;
                case 4:
                    System.out.println(menuCombinados);
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            Combinados.Combinado1();
                            break;
                        case 2:
                            Combinados.Combinado2();
                            break;
                        case 3:
                            Combinados.combinado3();
                            break;
                        case 4:
                            Combinados.Combinado4();
                            break;
                        case 5:
                            Combinados.Combinado5();
                            break;
                        case 6:
                            Combinados.Combinado6();
                            break;
                        case 7:
                            Combinados.Combinados7();
                            break;
                        case 8:
                            Combinados.combinado8();
                            break;
                        case 9:
                            Combinados.Combinado9();
                            break;
                        case 10:
                            Combinados.Combinado10();
                            break;
                        default:
                            option = 0;
                            break;
                    }
                    break;
                default:
                    option = 0;
                    break;
            }
        } while (option == 0);
    }
}


