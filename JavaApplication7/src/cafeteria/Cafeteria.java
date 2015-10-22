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
        //  Pessoa garcom = new Garcom("root", "123");
        //  Pessoa gerente = new Gerente("jose", "123");
        Pagamento pagamento = new CartaoDeCredito();

        PedidoProxy pe = PedidoProxy.getInstance();

    //        fp.setP(gerente);
        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        Lanche x = new XSalada();
        x = new Calabresa(x);
        
       
        pe.addItem(x);
        x.prepararLanche();
        System.out.println("---- Não vai fechar o pedido... ---- NAO VAI FECHAR PEDIDO");
        pe.fecharPedido();
        
        System.out.println("---- adicionando café no pedido ----");
        pe.addItem(cafe);
        
        System.out.println("Valor total: " + pe.calculaTotal());
        
        System.out.println("Contém um lanche e uma bebida por tanto pode ser fechado");
        
        pe.fecharPedido();
        pe.pagar(pagamento);
        

    }

}
