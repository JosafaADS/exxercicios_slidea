/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_operadores06;

import javax.swing.JOptionPane;

/**
 *
 * @author jos
 */
public class Exercicios_operadores06 {

    public static void main(String[] args) {
        double valor_final;
        JOptionPane.showMessageDialog(null, "Digita gasto do cliente no restaurando pra calcular os 10% do garcon: ");
        String valor = JOptionPane.showInputDialog(null, "Digite valor gasto: ");
        valor_final = Double.parseDouble(valor);
        valor_final += ((10 * valor_final) / 100);
        JOptionPane.showMessageDialog(null, "Valor a ser pago com os 10% do garcon: " + valor_final);
    }
}
