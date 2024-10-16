/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplosestruturadedecisao_exe06;
import javax.swing.JOptionPane;
/**
 *
 * @author jos
 */
public class ExemplosEstruturadeDecisao_exe06 
{

    public static void main(String[] args) 
    {
        double valor_diaria_s, valor_diaria_d, valor_diaria_t;
        String txt_tipo_diaria = JOptionPane.showInputDialog("Digite uma opcao: \n's' Quarto simples: \n'd' Quarto duplo: "+
                "\n't' Quarto triplo: \n");
        txt_tipo_diaria = txt_tipo_diaria.toUpperCase();
        if (txt_tipo_diaria.equals("S"))
        {
            String opt_s = JOptionPane.showInputDialog(null, "Valor da Diaria: \nQuarto Simples: R$ 255,50 \nDiaria para quantos dias? ");
            valor_diaria_s = Double.parseDouble(opt_s);
            if (valor_diaria_s != 0)
            {
                valor_diaria_s *= 255.50;
                JOptionPane.showMessageDialog(null, "Valor Total Diarias Quarto Simples: R$" + valor_diaria_s);        
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Digite um numero diferente de 0!!");
            }
            
        }
        else if (txt_tipo_diaria.equals("D"))
        {
            String d = JOptionPane.showInputDialog(null, "Valor da Diaria: \nQuarto Duplo: R$ 305,50 \nDiaria para quantos dias? ");
            valor_diaria_d = Double.parseDouble(d);
            
            if (valor_diaria_d != 0)
            {
                valor_diaria_d *= 305.50;
                JOptionPane.showMessageDialog(null, "Valor total Diarias Quarto Duplo: " + valor_diaria_d);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Digite um numero diferente de 0!!");
            }
        }
        else if (txt_tipo_diaria.equals("T"))
        {
            String t = JOptionPane.showInputDialog(null, "Valor da Diaria: \nQuarto Triplo: R$ 360,50 \nDiaria para quantos dias? ");
            valor_diaria_t = Double.parseDouble(t);
            if (valor_diaria_t != 0)
            {
                valor_diaria_t *= 560.50;
                JOptionPane.showMessageDialog(null, "Valor Total das Diarias Quarto Triplo: " + valor_diaria_t);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Digite um numero diferente de 0!!");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Tipo de diária inválido!!");
        }
    }
}
