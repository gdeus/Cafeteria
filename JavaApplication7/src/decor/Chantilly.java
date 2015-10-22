/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decor;

import bebida.Bebida;
import pedido.ItensDaVenda;

/**
 *
 * @author UTFPR
 */
public class Chantilly extends DecoradoresBebida{
    private ItensDaVenda b;

    public Chantilly(ItensDaVenda b) {
           this.b = b;
    }

    @Override
    public String getNome() {
        return b.getNome() + " com chantilly"; 
    }

    @Override
    public float custo() {
        return b.custo() + 1.00f;
    }
    
}
