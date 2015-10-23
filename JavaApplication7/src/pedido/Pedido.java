/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import Proxy.IPedido;
import bebida.Bebida;
import java.util.*;
import lanche.Lanche;
import modelo.Pessoa;
import observer.Observer;
import observer.Subject;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import state.Aberto;

/**
 *
 * @author UTFPR
 */
public class Pedido implements Subject, IPedido {

    private Status estado;
    ArrayList<ItensDaVenda> item;
    private ArrayList<Observer> observadores;

    public Pedido() {
        this.item = new ArrayList();
        this.item = new ArrayList<>();
        this.observadores = new ArrayList<>();
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
        for (ItensDaVenda item1 : item) {
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
        for (ItensDaVenda item1 : item) {
            valorTotal += item1.custo();
        }
        return valorTotal;
    }

    public void addItem(ItensDaVenda i) {
        estado.addItem(i);
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public ArrayList<ItensDaVenda> getItem() {
        return item;
    }

    public ArrayList<Observer> getObservadores() {
        return observadores;
    }

    public void setObservadores(ArrayList<Observer> observadores) {
        this.observadores = observadores;
    }
    

    public void setItem(ArrayList<ItensDaVenda> item) {
        this.item = item;
    }

    @Override
    public void addObservador(Pessoa p) {
        observadores.add(p);
    }

    @Override
    public void removeObservador(Pessoa p) {
        observadores.remove(p);
    }

    @Override
    public void notificarTodos() {
        for (Observer observador : observadores) {
            observador.notificar();
        }
    }
}
