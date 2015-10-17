package calculadorametodos;

import java.util.Scanner;

public class CalculadoraConMetodos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, opcion;
        try {
            System.out.println("ingrese el primer numero");
            num1 = entrada.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = entrada.nextInt();
            System.out.println("ingrese operacion");
            System.out.print(" 1° Sumar \n 2° Restar \n 3° Multiplicar "
                    + "\n 4° Dividir \n 5° Ordenar \n 6° Elevar \n 7° Salir \n");
            opcion = entrada.nextInt();
            Menu(opcion, num1, num2);
        } catch (Exception e) {
            System.out.println("ingrese solo numeros porfavor");
        }
    }

    /**
     * menu que inicia los metodos de la calculadora
     *
     * @param opc opcion que se ingresa luego de los numeros
     * @param n1 el primer numero ingresado
     * @param n2 segundo numero ingresado
     */
    public static void Menu(int opc, int n1, int n2) {
        boolean ciclo = true;
        do {

            switch (opc) {
                case 1:
                    System.out.println("el resultado es:" + sumar(n1, n2));
                    break;
                case 2:
                    System.out.println("el resultado es:" + restar(n1, n2));
                    break;
                case 3:
                    System.out.println("el resultado es:" + multiplicar(n1, n2));
                    break;
                case 4:
                    try {
                        System.out.println("el resultado es:" + dividir(n1, n2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error matematico");
                    }
                    break;
                case 5:
                    System.out.println("el resultado es:" + mayor(n1, n2));
                    break;
                case 6:
                    System.out.println("el resultado es:" + elevar(n1, n2));
                    break;
                case 7:
                    System.out.println("ingrese 1 para salir y cualquier numero para salir");
                    int op = entrada.nextInt();
                    ciclo = salir(op);
                    break;
            }
        } while (ciclo = true);

    }

    /**
     * Suma numero 1 y numero2
     *
     * @param numero1
     * @param numero2
     * @return suma de ambos numeros
     */
    public static int sumar(int numero1, int numero2) {
        return (numero1 + numero2);
    }

    /**
     * Resta numero1 y numero2
     *
     * @param numero1
     * @param numero2
     * @return resta de ambos numeros
     */
    public static int restar(int numero1, int numero2) {
        return (numero1 - numero2);
    }

    /**
     * multiplica numero1 y numero2
     *
     * @param numero1
     * @param numero2
     * @return multiplicacion de ambos numeros
     */
    public static int multiplicar(int numero1, int numero2) {
        return (numero1 * numero2);
    }

    /**
     * divide numero1 y numero2
     *
     * @param numero1
     * @param numero2
     * @return division de numero1 y numero 2
     */
    public static double dividir(int numero1, int numero2) {
        return (numero1 / numero2);
    }

    /**
     * muestra al mayor de 2 numeros si son iguales muestra el primero
     *
     * @param numero1
     * @param numero2
     * @return <ul>
     * <li>true:</li>
     * <li>false:</li>
     * </ul>
     */
    public static int mayor(int numero1, int numero2) {
        int rOrd;
        if (numero1 > numero2) {
            rOrd = numero1;
        } else if (numero2 > numero1) {
            rOrd = numero2;
        } else {
            rOrd = numero1;
        }
        return rOrd;
    }

    /**
     * eleva el numero1 por numero2
     *
     * @param numero1
     * @param numero2
     * @return numero1 elevado a numero2
     */
    public static int elevar(int numero1, int numero2) {
        return (numero1 ^ numero2);
    }

    /**
     * termina el ciclo del menu si la opcion es 1
     *
     * @param op
     * @return <ul>
     * <li>true: el ciclo del menu termina </li>
     * <li>false: el ciclo del menu continua </li>
     * </ul>
     */
    public static boolean salir(int op) {
        boolean ciclo = true;
        if (op != 1) {
            ciclo = false;
        }
        return ciclo;
    }
}
