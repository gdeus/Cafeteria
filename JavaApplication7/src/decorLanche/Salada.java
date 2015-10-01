/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorLanche;

import lanche.Lanche;
import lanche.XSalada;

/**
 *
 * @author UTFPR
 */
public class Salada extends Decoradores {

    private Lanche l;

    public Salada(Lanche l) {
        this.l = l;
    }

    @Override
    public String getNome() {
        if (l instanceof XSalada) {
            return l.getNome() + " com Muita Salada";
        } else {
            return l.getNome() + " com Salada";
        }
    }

    @Override
    public float custo() {
        return l.custo() + 0.50f;
    }

}
