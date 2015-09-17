/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

/**
 *
 * @author UTFPR
 */
public class CartaoDeCredito implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("Inserindo o cartão..");
        System.out.println("Digitando o valor..");
        System.out.println("Digitando a senha...");
        System.out.println("Autorizando transação...");
        System.out.println("Pagamento confirmado...");
        
    }
    
    
}
