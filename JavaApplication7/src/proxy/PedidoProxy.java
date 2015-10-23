/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import modelo.*;
import pagamento.Pagamento;
import pedido.ItensDaVenda;
import pedido.Pedido;

/**
 *
 * @author gabri
 */
public class PedidoProxy implements IPedido{

    Pessoa p;
    Pedido pe;
    Pessoa garcom;
    Pessoa cozinheiro;



    public PedidoProxy(Pessoa garcom, Pessoa cozinheiro) {
        this.cozinheiro = cozinheiro;
        this.garcom = garcom;
        pe = new Pedido();
    }
    
    public void setP(Pessoa p) {
        this.p = p;
    }

    @Override
    public void addItem(ItensDaVenda i) {
        if ((p instanceof Garcom)) {
            pe.addItem(i);
            pe.addObservador(cozinheiro);
            pe.addObservador(garcom);
            pe.notificarTodos();
        } else {
            System.out.println("Voce nao pode acessar essa pasta");
        }
    }

    @Override
    public void fecharPedido() {
        pe.fecharPedido();
    }

    @Override
    public void pagar(Pagamento pgto) {
        pe.pagar(pgto);
    }

    @Override
    public void abrirPedido() {
        pe.abrirPedido();
    }

    @Override
    public float calculaTotal() {
        return pe.calculaTotal();
    }
    
}
