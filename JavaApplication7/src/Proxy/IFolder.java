/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import pagamento.Pagamento;
import pedido.*;

/**
 *
 * @author gabri
 */
public interface IFolder {
    public abstract void fazerPedido(Item i);
    public abstract void fecharPedido();
    public abstract void pagar(Pagamento pgto);
    public abstract void abrirPedido();
    public abstract float calculaTotal();
}
