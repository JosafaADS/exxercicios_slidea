/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emprestimo_pendencia;
import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class Emprestimo_pendencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float salario;
        int pendencia;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        salario = entrada.nextFloat();
        System.out.println("Digite quantas pendencias tem: ");
        pendencia = entrada.nextInt();
        if (salario >= 2.500 && pendencia <= 2)
        {
            System.out.println("Salario = " + salario);
            System.out.println("Quantidade pendencias: " + pendencia);
            System.out.println("Emprestimo aprovado");
        }
        else
        {
            System.out.println("Salario = " + salario);
            System.out.println("Quantidade pendencias: " + pendencia);
            System.out.println("Emprestimo Reprovado");
        }
      
    }
    
}
