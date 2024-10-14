/*Um agricultor está cercando um terreno triangular e conseguiu cercar os lados a e
b que limitam com as estradas (na cor cinza), mas acabou a cerca. Quantos metros de
cerca terá que comprar para fechar completamente o triângulo desejado?

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_operadores03;
import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author jos
 */
public class Exercicios_operadores03 
{

    public static void main(String[] args) 
    {
        double a, b, c, angulo_grau, angulo_Radiano, perimetro;
        JOptionPane.showMessageDialog(null, "Digita os lados A e B \npara saber quanto de cerca deve comprar para completar o terreno");
        String lado_a = JOptionPane.showInputDialog(null, "Digite lado A: ");
        String lado_b = JOptionPane.showInputDialog(null, "Digite lado B: ");
        
        a = Double.parseDouble(lado_a);
        b = Double.parseDouble(lado_b);
        
        angulo_grau = 90;
        angulo_Radiano = (Math.PI / 180) * angulo_grau;
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(angulo_Radiano));//calcula cosseno pra encontrar lado C
        
        perimetro = a + b + c;
        
        JOptionPane.showMessageDialog(null,"A quantidade de cerca necessária: " + perimetro);
        
    }
}
