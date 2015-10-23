/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public interface Subject {
    public void addObservador(Pessoa p);
    public void removeObservador(Pessoa p);
    public void notificarTodos();
}