/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import Proxy.FolderProxy;
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
import modelo.*;

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
        Pessoa garcom = new Garcom("root", "123");
        Pessoa gerente = new Gerente("jose", "123");
        Pagamento pagamento = new CartaoDeCredito();

        FolderProxy fp = FolderProxy.getInstance();

        fp.setP(gerente);

        Bebida cafe = new Cafe();
        cafe = new Chantilly(cafe);

        Lanche x = new XSalada();
        x = new Calabresa(x);

        fp.fazerPedido(x);
        System.out.println("::NAO VAI FAZER PEDIDO::");

        fp.fecharPedido();
        System.out.println("::NAO VAI FECHAR::");

        fp.setP(garcom);
        fp.fazerPedido(x);
        System.out.println("::Adicionou XSalada + calabresa::");
        System.out.println(" Custo: R$" + fp.calculaTotal());
        //Lanche xS = new XSalada();
        //fp.fazerPedido(xS);
        fp.fecharPedido();
        System.out.println("Não deve fechar");
        fp.fazerPedido(cafe);
        System.out.println("adicionando café ");
        System.out.println(" Custo: R$" + fp.calculaTotal());
        fp.fecharPedido();
        fp.abrirPedido();
        fp.fecharPedido();
        System.out.println("fechando");
        fp.pagar(pagamento);
        System.out.println("pagando");
        fp.abrirPedido();
        fp.fazerPedido(cafe);
        System.out.println("adicionando café");
        System.out.println(" Custo: R$" + fp.calculaTotal());
        
    }
    
}
