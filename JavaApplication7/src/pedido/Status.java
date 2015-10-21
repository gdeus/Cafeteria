/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.Bebida;
import lanche.Lanche;
import pagamento.Pagamento;

/**
 *
 * @author UTFPR
 */
public interface Status {

    public abstract void addItem(Item i);

    public abstract void fecharPedido();

    public abstract void abrirPedido();

    public abstract void pagar(Pagamento p);
}
