/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.Pedido;
import pedido.Status;

/**
 *
 * @author UTFPR
 */
public class Fechado extends Status{
    
    Pedido p;
    Pagamento pgto;

    public Fechado(Pedido p) {
        this.p = p;
    }
    
    
    @Override
    public void addItem(Bebida b) {
        System.out.println("Seu pedido está fechado. Não é possível adicionar mais nada");
    }

    
    public void fecharPedido() {
        System.out.println("Esse pedido já foi fechado");
    }

    @Override
    public void abrirPedido() {
        System.out.println("Ok, vamos reabrir o seu pedido");
        p.setEstado(new Aberto(p));
    }

    @Override
    public void pagar(Pagamento p) {
        pgto = p;
        pgto.pagar();
    }
    
}
