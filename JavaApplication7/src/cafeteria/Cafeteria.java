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
import lanche.Lanche;
import lanche.XSalada;
import lanche.XTudo;
import pagamento.CartaoDeCredito;
import pagamento.Dinheiro;
import pagamento.Pagamento;
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
        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        Pedido p = new Pedido();
        Pagamento pgto = new CartaoDeCredito();
        p.addItem(cafe);

        System.out.println("Total do seu pedido: " + p.somaTotal());

        System.out.println("------------");

        System.out.println("---> Fechando o Pedido");
        p.fecharPedido();

        p.addItem(cafe);

        System.out.println("---> Abrindo o pedido novamente:");
        p.abrirPedido();
        p.addItem(cafe);
        p.fecharPedido();
        p.pagar(pgto);
        
        System.out.println("----------Lanche----------");
        Lanche x = new XSalada();
        x.prepararLanche();
        System.out.println("Meu lanche inicial: " + x.getNome() + "\tValor: " + x.custo());
        x = new Bacon(x);
        x.prepararLanche();
        System.out.println("----------Adicionando bacon----------");
        System.out.println("Meu lanche: " + x.getNome() + "\tValor: " + x.custo());
        
        System.out.println("----------X-TUDO----------");
        Lanche l = new XTudo();
        l.prepararLanche();
        System.out.println("Meu lanche: " + l.getNome() + "\tValor: " + l.custo());
        
        

    }

}
