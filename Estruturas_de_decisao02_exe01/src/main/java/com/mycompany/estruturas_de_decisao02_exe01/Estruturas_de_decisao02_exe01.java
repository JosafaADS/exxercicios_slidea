/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturas_de_decisao02_exe01;
import java.util.Scanner;//importando a scanner para montar e armazenar a entrada de dados via teclado no terminal
import javax.swing.JOptionPane;
/**
 *
 * @author jos
 */
public class Estruturas_de_decisao02_exe01 {

    public static void main(String[] args) 
    {
        String txt_digito = JOptionPane.showInputDialog(null, "Digite um valor entre 0 e 9:");
        
        switch (txt_digito)
        {
            case "0":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "1":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "5":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "6":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "7":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "8":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            case "9":
                JOptionPane.showMessageDialog(null, "Valor Correto");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Valor incorreto");
        }
    }
}
