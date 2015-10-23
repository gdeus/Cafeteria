/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import pedido.ItensDaVenda;
import pagamento.Pagamento;
import pedido.*;

/**
 *
 * @author gabri
 */
public interface IPedido {
    public abstract void addItem(ItensDaVenda i);
    public abstract void fecharPedido();
    public abstract void pagar(Pagamento pgto);
    public abstract void abrirPedido();
    public abstract float calculaTotal();
}