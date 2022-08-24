package Ejercicio6;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo valor"));

        System.out.println("la tangente del 1er valor es "+Math.tan(a));
        System.out.println("el coseno del 1er valor es "+Math.cos(a));
        System.out.println("el seno del 1er valor es "+Math.sin(a));
        System.out.println("el arcotangente del 1er valor es "+Math.atan(a));
        System.out.println("el arcotangente entre el 1er y 2do valor es "+Math.atan2(a,b));
        System.out.println("el valor de e al primer valor es "+Math.exp(a));
        System.out.println("el valor del log nat del 1er valor es "+Math.log(a));
        System.out.println("el valor de pi es "+Math.PI);
        System.out.println("el valor del nro Euler es "+Math.E);
    }

}
