/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import modelo.*;
import pagamento.Pagamento;
import pedido.Item;

/**
 *
 * @author gabri
 */
public class FolderProxy implements IFolder{

    Pessoa p;
    Folder f = new Folder();

    private static FolderProxy instance;

    public FolderProxy() {
    }

    public static FolderProxy getInstance() {
        if (instance == null) {
            instance = new FolderProxy();
        }
        return instance;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    @Override
    public void fazerPedido(Item i) {
        if ((p instanceof Garcom)) {
            f.fazerPedido(i);
        } else {
            System.out.println(":: Warning :: Acess Denied! ::");
        }
    }

    @Override
    public void fecharPedido() {
        f.fecharPedido();
    }

    @Override
    public void pagar(Pagamento pgto) {
        f.pagar(pgto);
    }

    @Override
    public void abrirPedido() {
        f.abrirPedido();
    }

    @Override
    public float calculaTotal() {
        return f.calculaTotal();
    }
    
}