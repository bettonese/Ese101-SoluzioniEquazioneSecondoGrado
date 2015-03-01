/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pippo;
import java.io.*;
import quadraticequationsolver.*;
import complexnumber.*;


public class Pippo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        String linea = "";
        
        QuadraticEquationSolver qes = new QuadraticEquationSolver();
        
        boolean valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente a: ");
            linea = tastiera.readLine();
            try {
                qes.a = Float.valueOf(linea).floatValue();
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente b: ");
            linea = tastiera.readLine();
            try {
                qes.b = Float.valueOf(linea).floatValue();
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        valoreValido = false;
        while(!valoreValido) {
            System.out.print("Inserisci il coefficiente c: ");
            linea = tastiera.readLine();
            try {
                qes.c = Float.valueOf(linea).floatValue();
                valoreValido = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Numero non valido");
            }
        }
        
        ComplexNumber x1 = qes.computeX1();
        ComplexNumber x2 = qes.computeX2();
        
        System.out.println("x1: " +x1.formatComplexNumber());
        System.out.println("x2: " +x2.formatComplexNumber());
    }
}