/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import bebida.Bebida;
import bebida.Cafe;
import decor.Canela;
import decor.Chantilly;

/**
 *
 * @author UTFPR
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bebida cafe = new Cafe();
        System.out.println("Dados do Cafe: ");
        System.out.println("Nome: " +cafe.getNome());
        System.out.println("Custo " + cafe.custo());
        
        System.out.println("++ Adicionando condimento");
        cafe = new Chantilly(cafe);
        System.out.println("Novos dados do café: ");
        System.out.println("Nome: " +cafe.getNome());
        System.out.println("Custo: " +cafe.custo());
        
        System.out.println("++ Adicionando condimento");
        cafe = new Canela(cafe);
        System.out.println("Novos dados do café: ");
        System.out.println("Nome: " +cafe.getNome());
        System.out.println("Custo: " +cafe.custo());
        
    }
    
}
