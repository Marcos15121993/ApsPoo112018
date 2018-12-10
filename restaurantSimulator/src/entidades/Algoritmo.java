package entidades;

import entidades.simulacao;

public class Algoritmo {

    private simulacao simulacao;
    public simulacao metodoSimulador(simulacao simula) {
        //Faz toda a simulacao
        Buffet b = new Buffet();
        b.setNrPessoas(simula.getPessoas());
        b.setNrPratos(simula.getPratos());
        b.setNrSalada(simula.getSalada());
        b.setNrCarboidratos(simula.getCarboidratos());
        b.setNrProteinas(simula.getProteinas());
        b.setSuco(simula.getSuco());
        b.setTpMinAlimentacao(simula.getTempoMinimo());
        b.setTpMaxAlimentacao(simula.getTempoMaximo());
        b.Start();
        simula.setTempoMedio(b.getbTempoMedio());
        simula.setTempoTotal(b.getbTempoTotal());
        this.simulacao = simula;    
        return simula;
    }
    
    public simulacao getSimulacao(simulacao simulacao){
        return simulacao;
    }
}
