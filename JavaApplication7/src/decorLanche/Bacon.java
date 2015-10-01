/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorLanche;

import lanche.Lanche;

/**
 *
 * @author UTFPR
 */
public class Bacon extends Decoradores {

    private Lanche l;

    public Bacon(Lanche l) {
        this.l = l;
    }

    @Override
    public String getNome() {
        return l.getNome() + " com Bacon";
    }

    @Override
    public float custo() {
        return l.custo() + (2.0f);
    }

}
