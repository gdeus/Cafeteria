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
public abstract class Status {
    public abstract void addItem(Bebida b);
    public abstract void addItem(Lanche l);
    public abstract void fecharPedido();
    public abstract void abrirPedido();
    
    public abstract void pagar(Pagamento p);
    
}
