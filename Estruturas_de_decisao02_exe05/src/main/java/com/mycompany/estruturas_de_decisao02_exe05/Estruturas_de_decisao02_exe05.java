/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturas_de_decisao02_exe05;
import javax.swing.JOptionPane;
/**Criar um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral:
• não-eleitor (abaixo de 16 anos)
• eleitor obrigatório (entre 18 e 65 anos)
• eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
 *
 * @author jos
 */
public class Estruturas_de_decisao02_exe05 {

    public static void main(String[] args) {
        int idade;
        String confere = "";
        JOptionPane.showMessageDialog(null, "Digite sua idade para saber sua classe eleitoral!!!");
        String txt_idade = JOptionPane.showInputDialog(null, "Qual sua idade: ");
        idade = Integer.parseInt(txt_idade);
        
        if (idade < 16)
        {
            confere = "ne";
        }
        else if (idade > 18 && idade < 65)
        {
            confere = "eo";
        }
        else if (idade >= 16 && idade < 18 || idade > 65)
        {
            confere = "ef";
        }
        switch (confere)
        {
            case "ne":
                JOptionPane.showMessageDialog(null, "não-eleitor (abaixo de 16 anos)");
                break;
            case "eo":
                JOptionPane.showMessageDialog(null, "eleitor obrigatório (entre 18 e 65 anos)");
                break;
            case "ef":
                JOptionPane.showMessageDialog(null, "eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)");
                break;
            default:
                JOptionPane.showMessageDialog(null, "digite numero");
        }
        
        
    }
}
