/*##########PROGRAMA ESCRITO EM NETBEANS##################
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
Faça um algoritmo e um programa em Java que peça do usuário um valor em graus
para um ângulo. Converta-o para radianos e, usando funções da biblioteca Math,
imprima o seno, cosseno e tangente deste ângulo.
*/
package com.mycompany.exercicio06;
import javax.swing.JOptionPane;//importando painel de opcoes visual para imprimir caixas de alertas e entradas de dados
import java.lang.Math;//importando biblioteca com funcoes matematicas
/**
 *
 * @author jos
 */
public class Exercicio06 
{

    public static void main(String[] args) 
    {
        //Saudacao inicial do programa, uma caixa de dialogo
        JOptionPane.showMessageDialog(null, "PROGRAMA DIGITE O VALOR EM GRAUS \nSAIBA SEU RADIANO!! \nSERA IMPRESSO SENO, COSSENO E TANGENTE DO ANGULO!!");
        
        //cria uma variavel do tipo String que recebe o valor digitado na caixa de entrada de dados criados pelo JOptionPane;
        String valor_angulo = JOptionPane.showInputDialog(null, "Digite o valor em Graus para o Angulo: ");
        
        //converte o tipo de dados da variavel valor_angulo, de String para double(real) e armazena na variavel valor;
        double valor = Double.parseDouble(valor_angulo);
        
        
        double radiano = (Math.PI / 180) * valor; //calcula o radiano: π / 180 * (valor do angulo). o mesmo que Math.ToRadians(valor)
        
        //Exibe o valor do angulo em graus para Radianos;
        JOptionPane.showMessageDialog(null,"o Radiano do angulo " + valor + " é: " + radiano);
        
        //exibe o valor do Cosseno usando o valor do radiano
        JOptionPane.showMessageDialog(null,"o Cosseno do angulo " + valor + " é: " + Math.cos(radiano));
        
        //exibe o valor do Seno usando o valor do radiano
        JOptionPane.showMessageDialog(null,"o Seno do angulo " + valor + " é: " + Math.sin(radiano));
        
        //exibe o valor da Tangente usando o valor do radiano
        JOptionPane.showMessageDialog(null,"a Tangente do angulo " + valor + " é: " + Math.tan(radiano));
        
        
        
        
    }
}
