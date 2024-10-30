/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturas_de_decisao02_exe03;
import javax.swing.JOptionPane;
/**
 *Uma empresa está selecionando entre seus estagiários os que irão fazer umtreinamento especial.
 * O selecionado deve satisfazer ao mesmo tempo a dois critérios.
 * O primeiro critério é que ele deve ter uma bolsa maior ou igual a R$ 750,00 emenor ou igual a R$ 950,00.
O segundo critério leva em conta o tempo de estágio, este deve ser maior ou iguala 2 anos.
Escreva um algoritmo que solicite ao usuário o valor da bolsa e o tempo de estágio,
* ecaso os critérios acima sejam satisfeitos, mostre a mensagem “Participará dotreinamento”, caso contrário mostre “Não participará”.
 * @author jos
 */
public class Estruturas_de_decisao02_exe03 {

    public static void main(String[] args) 
    {
        String txt_valor_bolsa = JOptionPane.showInputDialog(null, "Digite o valor da Bolsa em R$: ");
        String txt_tempo_estagio = JOptionPane.showInputDialog(null, "Digite o tempo do estagio (anos): ");
        double valor_bolsa = Double.parseDouble(txt_valor_bolsa);
        int tempo_estagio = Integer.parseInt(txt_valor_bolsa);
        String confirma;
        if (valor_bolsa >= 750 && valor_bolsa <= 950 && tempo_estagio >= 2)
        {
            confirma = "s";
        }
        else
        {
            confirma = "n";
        }
        switch (confirma)
        {
            case "s":
                JOptionPane.showMessageDialog(null, "Participará do treinamento");
                break;
            case "n":
                JOptionPane.showMessageDialog(null, "Nao Participará do treinamento");
                break;
            default:
                break;
                
        }
        
        
    }
}
