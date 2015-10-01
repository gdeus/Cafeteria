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
public class XSalada extends Lanche{

    public XSalada() {
        setNome("X-Salada");
    }
    
    @Override
    public float custo() {
         return (5.0f);
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Passando Maionese");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("Colocando Hamburguer");
    }
    
    
}
