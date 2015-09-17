/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.Bebida;
import java.util.ArrayList;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import state.Aberto;

/**
 *
 * @author UTFPR
 */
public class Pedido {

    ArrayList<Bebida> bebidas = new ArrayList();
    Pedido p;

    private Status estado;

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public Pedido() {
        this.bebidas = new ArrayList();
        this.estado = new Aberto(this);
    }

    public void abrirPedido() {
        estado.abrirPedido();
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public void fecharPedido() {
        estado.fecharPedido();
       
    }
    
    public void pagar(Pagamento p){
        estado.pagar(p);
    }

    public void addItem(Bebida b) {
        estado.addItem(b);
    }

    public float somaTotal() {
        float total = 0;
        for (Bebida bebida : bebidas) {
            total += bebida.custo();
        }
        
        return total;

    }

}
