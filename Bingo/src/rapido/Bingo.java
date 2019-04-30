/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapido;

import java.util.ArrayList;
import java.util.Collections;


public class Bingo {
    private ArrayList<Integer> bombo = new ArrayList<Integer>();
    private ArrayList<Integer> bolas_extraidas = new ArrayList<Integer>();
    private ArrayList<Carton> cartones = new ArrayList<Carton>();
    private ArrayList<Carton> cartones_ganadores = new ArrayList<Carton>();
    private boolean finalizado;
    private static final int bola_mayor=30;
    private static final int tamaño_del_carton=9;

    public Bingo() {
        for(int i=1;i<=bola_mayor;i++){
            this.bombo.add(i);
        }
    }

    
    public boolean Comprobar_carton(Carton carton){
       int c = 0;
        for(int to: this.bolas_extraidas) {
            for(int yo: carton.getNumero()){
                if(yo==to){
                c++;
            }
         }
     }
        if(c==carton.getTamaño()){
                return true;
        }else{
              return false;
            }
    }
    
    
    
    public Carton Generar_un_cartón(){
        //ArrayList<Integer> carton = new ArrayList<Integer>(); 
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for(int i=1; i<=30; i++){
            numeros.add(i);
            //System.out.println(numeros.get(i-1));
        }
        Collections.shuffle(numeros);
        
        int[]nmeros_carton = new int[tamaño_del_carton];
        for(int j=0; j<tamaño_del_carton; j++){
               nmeros_carton[j] = numeros.get(j);
               numeros.remove(j);  
               //System.out.println(nmeros_carton[j]);
        }
        
        //carton.add(nmeros_carton);
        
        Carton carto = new Carton(nmeros_carton);
        //carto.imprimirNumero();
        cartones.add(carto);
        
        
        return carto;
    }

    public int Extraer_una_bola(){
        int bolaExtraida;
        if(this.bombo.isEmpty()){
            this.finalizado = true;
        }
        
        if(finalizado == false){
             java.util.Collections.shuffle(this.bombo);
             bolaExtraida = this.bombo.get(0);
             this.bolas_extraidas.add(bolaExtraida);
             this.bombo.remove(0);
             for(Carton carton : this.cartones){
                 if(this.Comprobar_carton(carton)){
                     this.cartones_ganadores.add(carton);
                     this.finalizado = true;
                 }
             }
        }else{
            bolaExtraida = 0;
        }
        
        return bolaExtraida; 
    }
 
    public ArrayList<Integer> getBombo() {
        return bombo;
    }
    public ArrayList<Integer> getBolas_extraidas() {
        return bolas_extraidas;
    }
    public ArrayList<Carton> getCartones() {
        return cartones;
    }
    public ArrayList<Carton> getCartones_ganadores() {
        return cartones_ganadores;
    }
    public boolean isFinalizado() {
        return finalizado;
    }
    public static int getBola_mayor() {
        return bola_mayor;
    }

    public static int getTamaño_del_carton() {
        return tamaño_del_carton;
    }
    
    
}