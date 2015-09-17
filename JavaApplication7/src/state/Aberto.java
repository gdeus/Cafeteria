/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import bebida.Bebida;
import pagamento.Pagamento;
import pedido.Pedido;
import pedido.Status;

/**
 *
 * @author UTFPR
 */
public class Aberto extends Status{

    Pedido p;
    
    public Aberto(){
        
    }

    public Aberto(Pedido p) {
        this.p = p;
    }

    @Override
    public void addItem(Bebida b){
        System.out.println("Adicionando ao seu pedido: " +b.getNome());
        p.getBebidas().add(b);
    }

    @Override
    public void fecharPedido() {
        System.out.println("Ok, vamos lá. Fecharemos seu pedido");
        p.setEstado(new Fechado(p));
    }

    @Override
    public void abrirPedido() {
        System.out.println("Seu pedido já está aberto!!!");
    }

    public void pagar(Pagamento pgto) {
        System.out.println("Seu pedido está em aberto e não pode ser pago");
    }

    
    
    
    
}
