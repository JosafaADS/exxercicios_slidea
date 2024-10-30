/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturas_de_decisao02_exe02;
import javax.swing.JOptionPane;
/**
 *Crie um algoritmo que solicite ao usuário o seu turno de trabalho
 * e a quantidade dehoras trabalhadas, calcule e mostre o valor do salário. 
 * Considere os valores de horas aseguir, de acordo com o turno de trabalho.
 * Caso o turno seja igual a ‘N’ (utilize umcaractere para representar)
 * o valor da hora trabalhada é R$ 45,00, caso contrário é R$37,50
 * @author jos
 */
public class Estruturas_de_decisao02_exe02 {

    public static void main(String[] args) 
    {
        String txt_turno = JOptionPane.showInputDialog(null, "Digite a letra do codigo do seu turno de trabalho" +
                "\n 'N' (noite) ou 'D' (dia): ");
        txt_turno = txt_turno.toLowerCase();
        String txt_hr_trabalhada = JOptionPane.showInputDialog(null, "Digite a quantidade de horas trabalhadas");
        double valor = Double.parseDouble(txt_hr_trabalhada); 
        double valor_n = 45.00;
        double valor_d = 37.50;
        switch (txt_turno)
        {
            case "n":
                valor *= valor_n;
                JOptionPane.showMessageDialog(null, "O seu salario é: R$" + valor);
                break;
            case "d":
                valor *= valor_d;
                JOptionPane.showMessageDialog(null, "O seu salario é: R$" + valor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "digite umas das opcoes");
        }
    }
}
