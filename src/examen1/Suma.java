/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Suma extends Operacion {

    Suma(double valor1, double valor2) {

        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    int calcular() {
         double suma= valor1 + valor2;
      return (int) suma;
        
      

    }
    

    
    
    
    

}
