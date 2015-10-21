/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import bebida.Bebida;
import java.util.ArrayList;
import lanche.Lanche;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import state.Aberto;

/**
 *
 * @author UTFPR
 */
public class Pedido {

    private Status estado;
    ArrayList<Item> item;

    public Pedido() {
        this.item = new ArrayList();
        this.estado = new Aberto(this);
    }

    public void pagar(Pagamento p) {
        estado.pagar(p);
    }

    public void pago() {
        item.clear();
    }

    public void fecharPedido() {
        estado.fecharPedido();
    }

    public void abrirPedido() {
        estado.abrirPedido();
    }

    public boolean verificaPedido() {
        boolean l = false;
        boolean b = false;
        boolean t = false;
        for (Item item1 : item) {
            if (item1 instanceof Bebida) {
                b = true;
            }
            if (item1 instanceof Lanche) {
                l = true;
            }
            if (((l == true) && (b == true))) {
                t = true;
            }
        }
        return t;
    }

    public float calculaTotal() {
        float valorTotal = 0;
        for (Item item1 : item) {
            valorTotal += item1.custo();
        }
        return valorTotal;
    }

    public void addItem(Item i) {
        estado.addItem(i);
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }
}
