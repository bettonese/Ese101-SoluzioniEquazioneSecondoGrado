/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequationsolver;
import complexnumber.*;



public class QuadraticEquationSolver {
    public float a;
    public float b;
    public float c;
    private float delta;


    
    private void computeDeterminant(){
       this.delta=(this.b*this.b) - 4*this.a*this.c;
       
        
    }
    public ComplexNumber computeX1(){
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.re = -this.b;
            r.im = (float)Math.sqrt(-this.delta);
        }
        else {
            r.re = -this.b + (float)Math.sqrt(this.delta);
            r.im = 0;
        }
        r.re /= (2*this.a);
        r.im /= (2*this.a);
        return r;
    }
    
    public ComplexNumber computeX2(){
        this.computeDeterminant();
        ComplexNumber r = new ComplexNumber();
        if(this.delta < 0) {
            r.re = -this.b;
            r.im = -(float)Math.sqrt(-this.delta);
        }
        else {
            r.re = -this.b - (float)Math.sqrt(this.delta);
            r.im = 0;
        }
        r.re /= (2*this.a);
        r.im /= (2*this.a);
        return r;
    }
}
