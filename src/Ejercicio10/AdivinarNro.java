package Ejercicio10;

import javax.swing.*;

public class AdivinarNro {
    public static void main(String[] args) {
        int valorAleatorio = (int) (Math.random() * 100 + 1);
        int seleccion = -1;
        int intentos = 0;
        while (seleccion != valorAleatorio){
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("introduzca un nro de 0 a 100"));
            if (seleccion < valorAleatorio){
                System.out.println("el valor ingresado es menor al que debe adivinar, porfavor ingrese un mayor valor");
                intentos = intentos + 1;
            }else if (seleccion > valorAleatorio){
                System.out.println("el valor ingresado es mayor al que debe adivinar, porfavor ingrese un menor valor");
                intentos = intentos + 1;
            }else{
                System.out.println("Acertaste");
                intentos = intentos + 1;
                System.out.println("la cantidad de veces que intento acertar el nro es: "+intentos);
                break;
            }
        }
    }
}
