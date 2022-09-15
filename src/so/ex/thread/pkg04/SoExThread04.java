/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ex.thread.pkg04;


public class SoExThread04 {

    
    public static void main(String[] args) {
        
        int qtdSapos = 5;

        System.out.println("Corrida de Sapos! -> Distância: 100m");

        for (int i = 0; i < qtdSapos; i++) {
            ThreadSapo threadSapo = new ThreadSapo("SAPO-"+i);
            threadSapo.start();
        }

    }
    
    }
    

