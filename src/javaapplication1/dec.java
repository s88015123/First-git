/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
/**
 *
 * @author user
 */
class dec extends oper{
    dec(double A){
        this.A=A;
    }
    @Override
    double caculate(){
        return (A-1);
    }
}
