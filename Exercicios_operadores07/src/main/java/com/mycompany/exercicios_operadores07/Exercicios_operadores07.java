/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_operadores07;

import javax.swing.JOptionPane;

/**
 *
 * @author jos
 */
public class Exercicios_operadores07 {

    public static void main(String[] args) {
        int a, b, soma, subtrai, mult, divisao, modulo;
        JOptionPane.showMessageDialog(null, "Digite dois numero inteiros para saber o resultado das 5 operacoes: ");
        String num_a = JOptionPane.showInputDialog(null, "Digite primeiro numero: ");
        String num_b = JOptionPane.showInputDialog(null, "Digite segundo numero: ");
        a = Integer.parseInt(num_a);
        b = Integer.parseInt(num_b);
        soma = a + b;
        subtrai = a - b;
        mult = a * b;
        divisao = a / b;
        modulo = a % b;
        JOptionPane.showMessageDialog(null, "O resultado da soma: " + soma +
                "\nO resultado da subtracao: " + subtrai +
                "\nO resultado da multiplicacao: " + mult +
                "\nO resultado da divisao: " + divisao +
                "\nO resultado do resto da divisao: " + modulo);
                
    }
}
