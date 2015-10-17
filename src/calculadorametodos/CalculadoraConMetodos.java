package calculadorametodos;

import java.util.Scanner;

public class CalculadoraConMetodos {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, opcion;
        System.out.println("ingrese el primer numero");
        num1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("ingrese operacion");
        System.out.print(" 1° Sumar \n 2° Restar \n 3° Multiplicar "
                + "\n 4° Dividir \n 5° Ordenar \n 6° Elevar \n 7° Salir \n");
        opcion = entrada.nextInt();
        Menu(opcion, num1, num2);
    }

    public static void Menu(int opc, int n1, int n2) {
        switch (opc) {
            case 1:
                System.out.println(Sumar(n1, n2));
                break;
            case 2:
                System.out.println(Restar(n1, n2));
                break;
            case 3:
                System.out.println(Multiplicar(n1, n2));
                break;
            case 4:
                try
                {
                System.out.println(Dividir(n1, n2));
                }catch(ArithmeticException e){
                    System.out.println("Error matematico");
                }
                break;
            case 5:
                System.out.println(Ordenar(n1, n2));
                break;
            case 6:
                System.out.println(Elevar(n1, n2));
                break;
            case 7:
                System.out.println("ingrese 1 para salir y cualquier numero para salir");
                int op = entrada.nextInt();
                Salir(op);
                break;
        }

    }

    public static int Sumar(int numero1, int numero2) {
        return (numero1+numero2);
    }

    public static int Restar(int numero1, int numero2) {
        return(numero1-numero2);
    }

    public static int Multiplicar(int numero1, int numero2) {
        return (numero1*numero2);
    }

    public static double Dividir(int numero1, int numero2) {
        return(numero1/numero2);
    }

    public static int Ordenar(int numero1, int numero2) {
        int rOrd;
        if (numero1 > numero2) {
            rOrd = numero1;
        } else {
            rOrd = numero2;
        }
        return rOrd;
    }

    public static int Elevar(int numero1, int numero2) {
        return (numero1 ^ numero2);
    }

    public static boolean Salir(int op) {
        boolean ciclo;
        if (op == 1) {
            ciclo = true;
        } else {
            ciclo = false;
        }
        return ciclo;
    }

}
