/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_operadores05;

import javax.swing.JOptionPane;

/**
 *
 * @author jos
 */
public class Exercicios_operadores05 {

    public static void main(String[] args) {
        double base, altura, area;
        JOptionPane.showMessageDialog(null, "Digita a altura e a base do triangulo para saber sua area: ");
        String valor_base = JOptionPane.showInputDialog(null, "Digite lado A: ");
        String valor_altura = JOptionPane.showInputDialog(null, "Digite lado B: ");
        
        base = Double.parseDouble(valor_base);
        altura = Double.parseDouble(valor_altura);
        
        area = (base * altura) / 2;
        
        JOptionPane.showMessageDialog(null, "A area do triangulo é: " + area);
    }
}
