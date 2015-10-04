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
        
        Pedido po = new Pedido();
        Pagamento pgt = new CartaoDeCredito();
        
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
        
        System.out.println("----- PEDIDO COM LANCHE E BEBIDA -----");
        Bebida b = new Cafe();
        Lanche xl = new XSalada();
        xl.prepararLanche();
        xl = new Calabresa(xl);
        System.out.println("Seu lanche: " + xl.getNome() + "\tValor: " + xl.custo());
        po.abrirPedido();
        po.addItem(xl);
        
        b = new Canela(b);
        b = new Chantilly(b);
        b = new Chantilly(b);
        System.out.println("Sua bebida " + b.getNome() + "\tValor: " + b.custo());
        po.addItem(b);
        
        System.out.println("Total do seu Pedido: " + po.somaTotal());
        po.fecharPedido();
        po.pagar(pgt);
        
    }
    
}
