package Algoritmo;


import entidades.simulacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mestre_Yoda
 */
public class Algoritmo {
    public simulacao metodoSimulador(simulacao simula){
        //Faz toda a simulacao
        int tempoTotal = 100;
        double tempoMedio = 10.5;
        simula.setTempoTotal(tempoTotal);
        simula.setTempoMedio(tempoMedio);
        return simula;
    }
}
