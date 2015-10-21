/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

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
import pedido.Item;
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
        Pedido p = new Pedido();
        Pagamento pagamento = new CartaoDeCredito();
        Item cafe = new Cafe();
        cafe = new Chantilly(cafe);
        p.addItem(cafe);
        /*Lanche xS = new XSalada();
         p.addItem(xS);*/
        System.out.println("O valor total é: " + p.caculaTotal());
        p.fecharPedido();
        p.pagar(pagamento);

        System.out.println("\n\n\n");

        Lanche x = new XSalada();
        x = new Calabresa(x);
        
        p.addItem(x);
        System.out.println(" Custo: R$" + p.caculaTotal());
        p.fecharPedido();
        p.pagar(pagamento);
        
        
    }
    
}
