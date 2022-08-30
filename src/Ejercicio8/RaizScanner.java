package Ejercicio8;

import javax.swing.*;

public class RaizScanner {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("introduce algun numero"));
        System.out.println("la raiz de "+num+" es: "+Math.sqrt(num));
    }
}


