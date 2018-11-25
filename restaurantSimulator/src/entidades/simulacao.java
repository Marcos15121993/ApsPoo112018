package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos.Barros
 *
 */
public class simulacao {

    private static int idsimulacao, pessoas, pratos, salada, carboidratos,
            proteinas, suco, tempoTotal;
    private static double tempoMedio;

    public simulacao() {

    }

    public simulacao(int id, int pessoas, int pratos, int salada,
            int carboidratos, int proteinas, int suco,
            int tempoTotal, double tempoMedio) {

        simulacao.idsimulacao = idsimulacao;
        simulacao.pessoas = pessoas;
        simulacao.pratos = pratos;
        simulacao.salada = salada;
        simulacao.carboidratos = carboidratos;
        simulacao.proteinas = proteinas;
        simulacao.suco = suco;
        simulacao.tempoTotal = tempoTotal;
        simulacao.tempoMedio = tempoMedio;

    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        simulacao.pessoas = pessoas;
    }

    public int getPratos() {
        return pratos;
    }

    public void setPratos(int pratos) {
        simulacao.pratos = pratos;
    }

    public int getSalada() {
        return salada;
    }

    public void setSalada(int salada) {
        simulacao.salada = salada;
    }

    public int getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(int carboidratos) {
        simulacao.carboidratos = carboidratos;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        simulacao.proteinas = proteinas;
    }

    public int getSuco() {
        return suco;
    }

    public void setSuco(int suco) {
        simulacao.suco = suco;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        simulacao.tempoTotal = tempoTotal;
    }

    public double getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(double tempoMedio) {
        simulacao.tempoMedio = tempoMedio;
    }

    public int getId() {
        return idsimulacao;
    }

    public void setId(int id) {
        simulacao.idsimulacao = id;
    }

}
