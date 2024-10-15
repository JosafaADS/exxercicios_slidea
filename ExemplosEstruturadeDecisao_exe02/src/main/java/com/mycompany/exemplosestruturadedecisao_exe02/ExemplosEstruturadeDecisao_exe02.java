/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplosestruturadedecisao_exe02;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author jos
 */
public class ExemplosEstruturadeDecisao_exe02 {

    public static void main(String[] args) {
        String txt_idade = JOptionPane.showInputDialog(null, "Digite sua Idade:");
        int idade;
        idade = Integer.parseInt(txt_idade);
        if (idade >= 18)
        {
            JOptionPane.showMessageDialog(null,"Voce é maior de idade");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Voce é menor de idade");
        }
        
    }
}
