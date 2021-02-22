/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alberto
 */
public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        InputStreamReader variable_entrada = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(variable_entrada);
            String op = "";
            int valor_numerico1 = 0;
            int valor_numerico2 = 0;
            int incremento = 0;
            int valor_division = 0;
            String valor_escrito = "";
            BufferedReader br_numero;
            do {
                System.out.println ("********Menu de opciones********");
                System.out.println ("1- Establece el valor del primer número");
                System.out.println ("2- Establece el valor del segundo número");
                System.out.println ("3- Muestra qué número es superior o si son iguales");
                System.out.println ("4- Divide el primer número por el segundo");
                System.out.println ("5-Muestra la progresión numérica desde el primer número hasta el segundo");
                System.out.println ("0-Finalizar");
                System.out.print ("Elije la opción: ");
                try {
                    op = buffer.readLine();
                    switch(Integer.parseInt(op)) {
                        case 1: System.out.println ("Escribe el primer numero");
                        br_numero = new BufferedReader(new InputStreamReader(System.in));
                        valor_escrito = br_numero.readLine();
                        valor_numerico1 = Integer.parseInt(valor_escrito);
                        System.out.println ("El valor elegido es: " + valor_numerico1);
                        break;
                        case 2:System.out.println ("Escribe el segundo numero");
                        br_numero = new BufferedReader(new InputStreamReader(System.in));
                        valor_escrito = br_numero.readLine();
                        valor_numerico2 = Integer.parseInt(valor_escrito);
                        System.out.println ("El valor elegido es: " + valor_numerico2);
                        break;
                        case 3:;
                        if(valor_numerico1 > valor_numerico2){
                        System.out.println ("El primer numero es mayor");
                        }else if(valor_numerico1 < valor_numerico2){
                        System.out.println ("El segundo numero es mayor");    
                        }else if(valor_numerico1 == valor_numerico2){
                        System.out.println ("Ambos numeros son iguales");     
                        }

                        break;
                        case 4:;
                        valor_division = valor_numerico1 / valor_numerico2;
                        System.out.println ("La division es: "+valor_division); 
                        break;
                        case 5:;
                        while(valor_numerico1 < valor_numerico2){
                            

                        System.out.println (valor_numerico1);
                        valor_numerico1++;
                        }
                        break;
                        default : break;
                    }
                } catch (IOException e) {
                    System.out.println (e.toString());
                }
            } while (!op.equals("0"));
    }
}
