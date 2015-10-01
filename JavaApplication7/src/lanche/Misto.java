/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanche;

/**
 *
 * @author UTFPR
 */
public class Misto extends Lanche {

    public Misto() {
        setNome("Misto");
    }

    @Override
    public float custo() {
        return (3.0f);
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Passando maionese");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("Queijo, presunto e salada");
    }
    

}
