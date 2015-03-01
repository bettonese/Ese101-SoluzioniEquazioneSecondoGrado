/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;


public class ComplexNumber {
    public float re;
    public float im;
    
    public String formatComplexNumber(){
        String r = this.re + "+(" + this.im + ")i";
        return r;   
    }
    
}
