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
public class Calabresa extends Decoradores {

    private Lanche l;

    public Calabresa(Lanche l) {
        this.l = l;
    }

    @Override
    public String getNome() {
        return l.getNome() + " com calabresa";
    }

    @Override
    public float custo() {
        return l.custo() + (1.5f);
    }

}
