/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.Bebida;
import lanche.Lanche;
import pagamento.Pagamento;
import pedido.ItensDaVenda;
import pedido.Pedido;
import pedido.Status;

/**
 *
 * @author UTFPR
 */
public class Aberto implements Status {

    Pedido p;

    public Aberto(Pedido p) {
        this.p = p;
    }

    @Override
    public void addItem(ItensDaVenda i) {
        if (i instanceof Bebida) {
            Bebida b = (Bebida) i;
            System.out.println("Adicionando ao seu pedido(bebida) " + b.getNome());
            p.getItem().add(b);
        }
        if (i instanceof Lanche) {
            Lanche l = (Lanche) i;
            l.prepararLanche();
            System.out.println("Adicionando ao seu pedido(lanche) " + l.getNome());
            p.getItem().add(l);
        }
    }

    @Override
    public void fecharPedido() {
        if (p.verificaPedido()) {
            p.setEstado(new Fechado(p));
            System.out.println("ok, vamos lá. Fecharemos o seu pedido.");
        } else {
            System.out.println("O seu pedido nao tem 1 lanche e 1 bebida. Não é possivel fechar o pedido.");
        }
    }

    @Override
    public void abrirPedido() {
        System.out.println("Seu pedido já esta aberto. Não pode ser reaberto");
    }

    @Override
    public void pagar(Pagamento p) {
        System.out.println("Seu pedido esta aberto."
                + " Nao é possivel fazer o pagamento");
    }

    
    
    
    
}
