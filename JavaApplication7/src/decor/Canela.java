/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decor;

import bebida.Bebida;

/**
 *
 * @author UTFPR
 */
public class Canela extends DecoradoresBebida{
    private Bebida b;

    public Canela(Bebida b) {
        this.b = b;
    }
    

    @Override
    public String getNome() {
        return b.getNome() + " com chantilly";
    }

    @Override
    public float custo() {
        return b.custo() + 0.50f;
    }
}
