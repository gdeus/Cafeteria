/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebida;

import pedido.ItensDaVenda;

/**
 *
 * @author UTFPR
 */
public abstract class Bebida extends ItensDaVenda{
    String nome;

    public String getNome() {
        return nome;
    }
    
    public abstract float custo();

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}