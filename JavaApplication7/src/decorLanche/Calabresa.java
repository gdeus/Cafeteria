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
public class Calabresa extends Decoradores {

    Lanche x;

    public Calabresa(Lanche x) {
        this.x = x;
    }

    @Override
    public String getNome() {
       
       return (this.x.getNome() + ", com mais Calabresa");
        
            
    }

    @Override
    public float custo() {
        return (this.x.custo() + 1.5f);
    }
}
