/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplosestruturadedecisao_exe03;
import java.util.Scanner;
/**
 *
 * @author jos
 */
public class ExemplosEstruturadeDecisao_exe03 {

    public static void main(String[] args) {
        double n1, n2, m;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a nota 01: ");
        n1 = entrada.nextDouble();
        
        System.out.println("Digite a nota 02: ");
        n2 = entrada.nextDouble();
        
        m = (n1 + n2) / 2;
        
        if (m >= 6)
        {
            System.out.println("Voce esta aprovado");
        }
        else
        {
            System.out.println("Voce foi reprovado");
        }
    }
}
