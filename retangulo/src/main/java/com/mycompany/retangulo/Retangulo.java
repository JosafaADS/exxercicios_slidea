/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retangulo;
import javax.swing.JOptionPane;
/**
 *
 * @author jos
 */
public class Retangulo 
{

    public static void main(String[] args) 
    {
        double perimetro, area;//Declarando as variaveis para os valores dos calculos da area e perimetro!!
        JOptionPane.showMessageDialog(null, "Programa Calcula perimetro");//msg boas vindas!!
        JOptionPane.showMessageDialog(null, "Digite o valor de um lado: ");//Inicio do programa solicitando os valores
        String ladoA = JOptionPane.showInputDialog(null, "Digite o lado A: ");//solicitando e guardando no ladoA os valores do lado A
        double num_ladoA = Double.parseDouble(ladoA);//convertendo do tipo String para tipo Real
        String ladoB = JOptionPane.showInputDialog(null, "Digite o lado B: ");//solicitando e guardando no ladoB os valores lado B
        double num_ladoB = Double.parseDouble(ladoB);//Convertendo do tipo String para tipo Real
        perimetro = (2 * num_ladoA) + (2 * num_ladoB);//calcula perimetro do retangulo-->perimetro = 2 * lado A + 2 * lado B
        JOptionPane.showMessageDialog(null, "Perimetro: " + perimetro + " cm");//exibe o perimetro
        area = num_ladoA * num_ladoB;//calcula a area total do retangulo em CM quadrados
        JOptionPane.showMessageDialog(null, "A Area total do retangulo é: " + area + "CM quadrados!");//Exibe a area total do retangulo
        //em CM quadadros.
    }
}
