/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import observer.Observer;

/**
 *
 * @author gabri
 */
    public abstract class Pessoa implements Observer{

    private String login;
    private String password;

    public Pessoa(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void notificar() {
        System.out.println("Usuario \"" + login + "\" sendo notificado");
    }

}
