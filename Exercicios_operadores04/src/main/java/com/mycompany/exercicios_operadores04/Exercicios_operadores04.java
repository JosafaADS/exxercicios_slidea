/*Elabore um algoritmo que leia dois números inteiros e imprima o resto da divisão
inteira de um pelo outro.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_operadores04;
import javax.swing.JOptionPane;
/**
 *
 * @author jos
 */
public class Exercicios_operadores04 
{

    public static void main(String[] args) 
    {
        int a, b;
        JOptionPane.showMessageDialog(null, "Digite dois numero inteiros para saber o resto da divisao: ");
        String num_a = JOptionPane.showInputDialog(null, "Digite primeiro numero: ");
        String num_b = JOptionPane.showInputDialog(null, "Digite segundo numero: ");
        a = Integer.parseInt(num_a);
        b = Integer.parseInt(num_b);
        a %= b;
        JOptionPane.showMessageDialog(null, "O resto da divisao : " + a);
        
    }
}
