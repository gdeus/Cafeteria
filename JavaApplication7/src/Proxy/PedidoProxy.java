/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import pagamento.Pagamento;
import pedido.ItensDaVenda;
import pedido.Pedido;

/**
 *
 * @author gabri
 */
public class PedidoProxy implements IPedido {

    Pedido pe;

    private static PedidoProxy instance;

    public PedidoProxy() {
        pe = new Pedido();
    }

    public static PedidoProxy getInstance() {
        if (instance == null) {
            instance = new PedidoProxy();
        }
        return instance;
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

    public void addItem(ItensDaVenda i) {

        pe.addItem(i);

    }

}
