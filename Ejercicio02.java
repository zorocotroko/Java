/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.io.IOException;

/**
 *
 * @author Alberto
 */
public class Ejercicio02 {

    public static void main(String[] args) throws IOException {
        int variableEntera = 10;
        System.out.println("Variable tipo int muestra datos enteros de 32 bits. Ejemplo:" + variableEntera);
        boolean variablebool = true;
        System.out.println("Boolean puede mostrar true o false ,resultantes de evaluar expresiones.");
        byte variablebyte = 100;
        System.out.println("Byte emplea un solo byte (8 bits) de almacenamiento. Esto permite almacenar valores en el rango [-128, 127]");
        char variablechar = 'S';
        System.out.println("Char se utiliza para almacenar caracteres individuales.");
        short variableshort = -10;
        System.out.println("Guarda números enteros entre -32768 y +32767");
        int variableint = -100;
        System.out.println("Guarda numeros enteros entre  -2,147,483,648 al 2,147,483,647 ");
        long variablelong = 2000L;
        System.out.println("Puede guardar el numero entero de mayor tamaño, de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807");
        float variablefloat = 10.5F;
        System.out.println("Guarda numeros con decimales, hasta con 7 decimales");
        double variabledouble = 10.5;
        System.out.println("Guarda numeros con decimales, hasta con 14 decimales");
//Dentro de la clase de nombre Ejercicio02, añade un ejemplo de uso de cada uno de los operadores aritméticos,  relacionales, lógicos, unitarios
//y de asignación. Indicando con un comentario y con un mensaje por consola cual será el resultado de cada uno de ellos.
//Ej: System.out.println("--Operadores lógicos--");
//System.out.println("El resultado de true && false es:"+ (true && false) );
System.out.println("--Operadores aritméticos--");
int resultado_suma = 10 + 25;
System.out.println("El resultado de 10+25 = " + (resultado_suma));
int resultado_resta = 10 - 25;
System.out.println("El resultado de 10-25 = " + (resultado_resta));
int resultado_multiplicacion = 10 * 25;
System.out.println("El resultado de 10*25 = " + (resultado_multiplicacion));
int numero1 = 10;
int numero2 = 25;
double resultado_division = (double)numero1/numero2;
System.out.println("El resultado de 10/25 = " + (resultado_division));
int resultado_resto = 9%2;
System.out.println("El resto de 9%2 = " + (resultado_resto));
System.out.println("--Operadores de Asignacion--");
double numero = 55.3221;
System.out.print("Sumamos 50 a la variable numero con valor " + numero + ": ");
numero +=50;
System.out.println(numero);
System.out.print("Restamos 140.10 a la variable numero con valor " + numero + ": ");
numero -=140.10;
System.out.println(numero);
System.out.print("Multiplicamos por  100 a la variable numero con valor " + numero + ": ");
numero *=100;
System.out.println(numero);
System.out.print("Dividimos por  1000 a la variable numero con valor " + numero + ": ");
numero /=1000;
System.out.println(numero);
System.out.print("Averiguamos el resto de dividir el numero " + numero + " entre 255: ");
numero %=2;
System.out.println(numero);
System.out.println("--Operadores relacionales--");
String palabra = "prueba";
int numero_primero = 55;
int numero_segundo = 10;
System.out.println("La palabra "+ palabra != "es diferente de pruebo");
System.out.println("El numero " + numero_primero + " es mayor que " + numero_segundo + ": " +(numero_primero > numero_segundo) );
System.out.println("El numero " + numero_segundo + " es menor que " + numero_primero + ": " +(numero_primero < numero_segundo) );
numero_segundo = 55;
System.out.println("El numero " + numero_segundo + " es igual " + numero_primero + ": " +(numero_primero >= numero_segundo) );
numero_primero = 15;
System.out.println("El numero " + numero_primero + " es menor " + numero_segundo + ": " +(numero_primero <= numero_segundo) );
System.out.println("--Operadores lógicos--");
System.out.println("El resultado de true && false es:"+ (true && false) );
System.out.println("El resultado de true && true es:"+ (true && true) );
System.out.println("El resultado de true o false es:"+ (true || true) );
System.out.println("El resultado contrario de true es:"+ (!true) );
System.out.println("--Operadores unitarios--");
int num_incremento = 5;
System.out.println("El numero es " + num_incremento + ", si lo incrementamos se convierte en " + ++num_incremento);
System.out.println("El numero es " + num_incremento + ", si lo decrementamos se convierte en " + --num_incremento);
System.out.println("El numero es " + num_incremento + ", si le cambiamos el signo se convierte en " + -num_incremento);
boolean variable_bool = true;
System.out.print("Cambiamos la variable de true a false: ");
System.out.println(variable_bool = !true);


    }
}
