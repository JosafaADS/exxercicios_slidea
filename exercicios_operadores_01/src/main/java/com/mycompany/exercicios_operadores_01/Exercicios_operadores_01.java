/*#####PROGRAMA ESCRITO EM IDE NETBEANS#######
Construir um algoritmo que calcule e visualize a área da base e o volume de umcilindro,
sabendo que para isso é necessário conhecer o raio (r) e a altura (h) do cilindro

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_operadores_01;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author jos
 */
public class Exercicios_operadores_01 {

    public static void main(String[] args) {
        double area, r_cilindro, a_cilindro, v_cilindro; //declarando as variaveis que receberam os valores para raio e altura, 
        //e tambem as que vao receber o valor do calcula da area da base do cilindro e do volume do cilindro!!
        
        
        JOptionPane.showMessageDialog(null, "Programa Calcula area base e volume de um Cilindro!!");//saudacao do programa
        JOptionPane.showMessageDialog(null, "Para calcular digite \no Raio e Altura do Cilindro a seguir!!!");//informando os dados que deve 
        //ser fornecido pelo usuario
        
        
        //recebe o valor correspondente ao Raio e armazena na string raio!!
        String raio = JOptionPane.showInputDialog(null, "Digite o Raio do Cilindro: ");
        
        //recebe o valor correspondente a Altura e armazena na string altura!!
        String altura = JOptionPane.showInputDialog(null, "Digite a Altura do Cilindro: ");
        r_cilindro = Double.parseDouble(raio);//converte o tipo string em Double(real) e armazena em r_cilindro.
        a_cilindro = Double.parseDouble(altura);//converte o tipo string em Double(real) e armazena em a_cilindro.
        
        area = Math.PI * Math.pow(r_cilindro, 2);//realiza o calculo da area da base do cilindro (area = π * r_cilindro elevado ao quadrado)
        
        v_cilindro = a_cilindro * Math.PI * Math.pow(r_cilindro, 2);//realiza o calculo do volume do cilindro, (volume = a_cilindro * π * r_cilindro elevado ao quadrado).
        JOptionPane.showMessageDialog(null, "O Area da Base do Cilindro é: " + area + " \n" + 
                "O Volume do Cilindro é: " + v_cilindro);//exibe resultados dos calculos da area de base e volume do cilindro.
        
        
    }
}
