package app;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class calculadora {
public static Scanner teclado = new Scanner(System.in);
public static void main(String[] args) {
    int operacion;
    do{
        Menu();
        System.out.println("Ingrese la Opcion");
        operacion = Integer.valueOf(teclado.nextLine());
        switch (1) {
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                salir();
                break;
        
            default:
                break;
        }
    } while (operacion != 4);
}
public static void Menu() {
    System.out.println("MENU DE OPCIONES");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Salir");
}

public static void sumar() {
    String cadena;
    double resultado = 0;
    do {
        do {
            System.out.println("Ingrese valores: ");
            cadena = teclado.nextLine();
        } while (!EsEntero(cadena) && !cadena.equals("N"));
        if (cadena.equals("N")) {
            System.out.println(" Respuesta: " + resultado);

        }else{
            resultado = resultado + Double.parseDouble(cadena);
        }
    } while (!cadena.equals("N") );
    
}

public static void restar() {
    String cadena;
    double resultado = 0;
    do {
        do {
            System.out.println("Ingrese valores: ");
            cadena = teclado.nextLine();
        } while (!EsEntero(cadena) && !cadena.equals("N"));
        if (cadena.equals("N")) {
            System.out.println(" Respuesta: " + resultado);

        }else{
            resultado = resultado - Double.parseDouble(cadena);
        }
    } while (!cadena.equals("N") );
    
}

public static void multiplicar() {
    String cadena;
    double resultado = 1;
    do {
        do {
            System.out.println("Ingrese valores: ");
            cadena = teclado.nextLine();
        } while (!EsEntero(cadena) && !cadena.equals("N"));
        if (cadena.equals("N")) {
            System.out.println(" Respuesta: " + resultado);

        }else{
            resultado = resultado * Double.parseDouble(cadena);
        }
    } while (!cadena.equals("N") );
    
}

public static void dividir() {
    String cadena;
    double resultado = 1;
    do {
        do {
            System.out.println("Ingrese valores: ");
            cadena = teclado.nextLine();
        } while (!EsEntero(cadena) && !cadena.equals("N"));
        if (cadena.equals("N")) {
            System.out.println(" El resultado es: " + resultado);

        }else{
            resultado = resultado / Double.parseDouble(cadena);
        }
    } while (!cadena.equals("N") );
    
}

public static void salir() {
    System.out.println("Hasta pronto...");
}
}    
