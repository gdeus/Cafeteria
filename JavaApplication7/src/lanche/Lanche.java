/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanche;

/**
 *
 * @author UTFPR
 */
public abstract class Lanche {

    String nome;

    public String getNome() {
        return nome;
    }

    public abstract float custo();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cortarPao() {
        System.out.println("Estamos cortando seu pão");
    }

    public void adicionarCondimentos() {
    }

    public void adicionarRecheioPrincipal() {
    }

    public void prensar() {
        System.out.println("Seu lanche está sendo prensado!!!");
    }

    public void servir() {
        System.out.println("Servir lanche!!!");
    }

    public final void prepararLanche() {
        cortarPao();
        adicionarCondimentos();
        adicionarRecheioPrincipal();
        prensar();
        servir();

    }
}
