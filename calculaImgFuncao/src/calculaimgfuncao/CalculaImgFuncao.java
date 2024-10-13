/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculaimgfuncao;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author autologon
 */
public class CalculaImgFuncao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double y, x;
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("##Calcula valor de 'x' em funcao de 'y = f(x) = 3 + 2x'##");
            System.out.println("Digite o um valor 'x': ");    
            x = entrada.nextDouble();
            y = 3 + (2 * x);
            System.out.println("O resultado contra dominio de X \n" + 
                    "em funcao da imagem 'y = 3 + 2x' é: " + y + "\n");
        }
        
        // TODO code application logic here
    }
    
}
