/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import Proxy.PedidoProxy;
import bebida.Bebida;
import bebida.Cafe;
import decor.Canela;
import decor.Chantilly;
import decorLanche.Bacon;
import decorLanche.Calabresa;
import lanche.Lanche;
import lanche.XSalada;
import lanche.XTudo;
import modelo.*;
import pagamento.CartaoDeCredito;
import pagamento.Dinheiro;
import pagamento.Pagamento;
import pedido.ItensDaVenda;
import pedido.Pedido;

/**
 *
 * @author UTFPR
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here     
        Pessoa garcom = new Garcom("TESTE", "123");
        Pessoa gerente = new Gerente("jose", "123");
        Pagamento pagamento = new CartaoDeCredito();

        PedidoProxy pi = new PedidoProxy(garcom);
        PedidoProxy px = new PedidoProxy(gerente);
        
        px.setP(gerente); 
        pi.setP(garcom);

  
        pi.abrirPedido();
        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        Lanche x = new XSalada();
        x = new Calabresa(x);
        
       
        
        pi.addItem(x);
        x.prepararLanche();
        System.out.println("Não deve fechar o pedido pois nao contem dois itens");
        pi.fecharPedido();
        pi.addItem(cafe);
        
        System.out.println("Dois itens agora pode ser fechado!!! ");
        
        pi.fecharPedido();
        System.out.println(pi.calculaTotal());
        pi.pagar(pagamento);
        
        

    }

}
