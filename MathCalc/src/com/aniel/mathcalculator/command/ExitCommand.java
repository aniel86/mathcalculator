/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aniel.mathcalculator.command;

/**
 *
 * @author Aniel Bkiram Thapa
 */
public class ExitCommand extends MathCommand{

    @Override
    public double execute(double x, double y) {
        System.exit(0);
        return 0; 
        
    }
       
        
    
    
}
