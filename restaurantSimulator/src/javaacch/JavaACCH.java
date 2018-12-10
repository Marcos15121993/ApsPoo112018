/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaacch;

/**
 *
 * @author Katia Miglioli
 */
public class JavaACCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int nrPessoas =  5;
    int nrPratos = 100;
    int nrSalada = 2;
    int nrCarboidratos = 10;
    int nrProteinas = 25;
    int suco = 3;
    int tpMinAlimentacao = 10;
    int tpMaxAlimentacao = 28;
    
    Buffet b = new Buffet();
    b.setNrPessoas(nrPessoas);
    b.setNrPratos(nrPratos);
    b.setNrSalada(nrSalada);
    b.setNrCarboidratos(nrCarboidratos);
    b.setNrProteinas(nrProteinas);
    b.setSuco(suco);
    b.setTpMinAlimentacao(tpMinAlimentacao);
    b.setTpMaxAlimentacao(tpMaxAlimentacao);
    b.Start();
    }
    
}
