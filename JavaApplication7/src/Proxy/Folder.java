/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import pagamento.Pagamento;
import pedido.Item;
import pedido.Pedido;

/**
 *
 * @author gabri
 */
public class Folder implements IFolder {

    Pedido p = new Pedido();

    public Folder() {

    }

    @Override
    public void fazerPedido(Item i) {
        p.addItem(i);
    }

    @Override
    public void fecharPedido() {
        p.fecharPedido();
    }

    @Override
    public void pagar(Pagamento pgto) {
        p.pagar(pgto);
    }

    @Override
    public void abrirPedido() {
        p.abrirPedido();
    }

    @Override
    public float calculaTotal() {
        return p.calculaTotal();
    }

}