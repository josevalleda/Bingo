/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapido;

import java.util.ArrayList;


public class Carton {
    private final ArrayList<Integer> numero = new ArrayList<Integer>();
    private int tamaño;
    
    
    public Carton(int...numero) {
        for(int number : numero){
            this.numero.add(number);
        }
        this.tamaño = this.numero.size();
    }


    public ArrayList<Integer> getNumero() {
        return numero;
    }
    public void imprimirNumero(){
        System.out.println ("los numeros son: ");
        for(int numero : this.numero){
            System.out.print(numero+",");
        }
        System.out.println ("");
    }

    public int getTamaño() {
        return tamaño;
    }

    void add(ArrayList<Integer> nmeros_carton) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
