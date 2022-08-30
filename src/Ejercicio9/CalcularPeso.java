package Ejercicio9;

import javax.swing.*;

public class CalcularPeso {
    public static void main(String[] args) {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("introduzca su altura en cm"));
        int sexo = Integer.parseInt(JOptionPane.showInputDialog("introduzca 1 si es hombre o 2 si es mujer"));
        if (sexo == 1){
            System.out.println("su peso ideal es de: "+(altura-110)+"kg");
        } else if (sexo == 2){
            System.out.println("su peso ideal es de: "+(altura-120)+"kg");
        } else {
            System.out.println("el numero introducido no corresponde a ninguna opcion");
        }
    }
}
