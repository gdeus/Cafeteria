/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decor;

import bebida.Bebida;

/**
 *
 * @author UTFPR
 */
public abstract class DecoradoresBebida extends Bebida{
    
    Bebida b;
    
    @Override
    public abstract String getNome();
    
    
 }
