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
public class XTudo extends Lanche {

    private Lanche l;

    public XTudo() {
        setNome("X-Tudo");
    }

    @Override
    public float custo() {
        return (7.0f);
    }

    @Override
    public void adicionarCondimentos() {
        System.out.println("Passando Maionese, Ketchup e mostarda");
    }

    @Override
    public void adicionarRecheioPrincipal() {
        System.out.println("Colocando Hamburguer, calabresa, bacon, ovo.");
    }

}
