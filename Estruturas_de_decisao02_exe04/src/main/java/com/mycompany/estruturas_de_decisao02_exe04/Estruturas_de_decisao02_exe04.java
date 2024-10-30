/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturas_de_decisao02_exe04;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *Elabore um algoritmo para calcular as raízes de uma equação de segundo grau,
 *masverifique nesta versão que delta deverá ser um valor positivo, 
 * para poder calcular evisualizar as raízes reais da equação. 
 * Caso contrário, visualize uma mensagem explicando que não serão calculadas as raízes
 * @author jos
 */
public class Estruturas_de_decisao02_exe04 {

    public static void main(String[] args) 
    {
        double coef_a, coef_b, coef_c, x1, x2, delta;
        String ver_delta;
        JOptionPane.showMessageDialog(null, "Digite os 3 coeficientes para calcular as raizes!!!");
        String txt_coef_a = JOptionPane.showInputDialog(null, "Digite o Coeficiente a: ");
        String txt_coef_b = JOptionPane.showInputDialog(null, "Digite o Coeficiente b: ");
        String txt_coef_c = JOptionPane.showInputDialog(null, "Digite o Coeficiente c: ");
        coef_a = Double.parseDouble(txt_coef_a);
        coef_b = Double.parseDouble(txt_coef_b);
        coef_c = Double.parseDouble(txt_coef_c);
        
        delta = Math.pow(coef_b, 2) - (4 * coef_a * coef_c);
        
        if (delta > 0)
        {
            ver_delta = "v";
        }
        else
        {
            ver_delta = "f";
        }
        switch (ver_delta)
        {
            case "v":
                x1 = - (coef_b + Math.sqrt(delta)) / (2 * coef_a);
                x2 = - (coef_b - Math.sqrt(delta)) / (2 * coef_a);
                JOptionPane.showMessageDialog(null, "Coeficientes: \n" +
                        "Coeficiente a: " + coef_a +
                        "\nCoeficiente b: " + coef_b +
                        "\nCoeficiente c: " + coef_c);
                JOptionPane.showMessageDialog(null, "As raizes são: \n" +
                        "x: " + x1 +
                        "\nx: " + x2);
                break;
            case "f":
                JOptionPane.showMessageDialog(null, "Esta equacao nao possui duas raizes, portanto nao sera calculada!");
            default:
                break;
        }
    }
}
