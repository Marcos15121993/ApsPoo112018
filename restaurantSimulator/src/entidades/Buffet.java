
package entidades;

import java.util.Random;
 
public class Buffet {
    private int nrPessoas;
    private int nrPratos;
    private int nrSalada;
    private int nrCarboidratos;
    private int nrProteinas;
    private int suco ;
    private int tpMinAlimentacao;
    private int tpMaxAlimentacao;
    private Pessoa listPessoas[];
    private itensBuffet itens[];
    private int resultados[];
    private int bTempoMedio;
    private int bTempoTotal;
    private int bTempoMinimo;
    private int bTempoMaximo;
    
    public void Start(){
        // INICIA OS ARRAYS
        this.listPessoas = new Pessoa[this.getNrPessoas()];//ARRAY DE PESSOAS
        this.resultados = new int[this.getNrPessoas()];//ARRAY DE PESSOAS
        this.itens = new itensBuffet[5];// ARRAY DE OPCOES NO BUFFET
        //CONSTRUIR E POPULAR O VETOR COM AS OPCOES DO BUFFET
        itens[0] = new itensBuffet();
        itens[0].setQtsSuportado(nrPratos);//index 0 = PRATO
        itens[0].setQtdAtual(nrPratos);
        itens[1] = new itensBuffet();
        itens[1].setQtsSuportado(nrSalada);//index 1 = SALADAS
        itens[1].setQtdAtual(nrSalada);
        itens[2] = new itensBuffet();
        itens[2].setQtsSuportado(nrCarboidratos);//index 2 = CARBOIDRATOS
        itens[2].setQtdAtual(nrCarboidratos);
        itens[3] = new itensBuffet();
        itens[3].setQtsSuportado(nrProteinas);//index 3 = PROTEINA
        itens[3].setQtdAtual(nrProteinas);
        itens[4] = new itensBuffet();
        itens[4].setQtsSuportado(suco);//index 4 = SUCO
        itens[4].setQtdAtual(suco);
       
        //
        this.fila();
        this.numerosAleatorios();
        this.processarResultados();
        this.bTempoMedio = tempoMedio();
        this.bTempoTotal = tempoTotal();
        System.err.println("Tempo Medio:" + bTempoMedio);
        System.err.println("Tempo total:"+ bTempoTotal);
        
       
    }
    public void processarResultados(){
        for(int i = 0; i < this.listPessoas.length; i++){
            this.resultados[i] = this.listPessoas[i].getTempoAlimentaca() + this.listPessoas[i].getTempoBuffet();
        }
        
        
    }
    public int tempoTotal(){
        int total = 0;
        for(int i = 0 ; i < this.resultados.length; i++){
            if(this.resultados[i] >=total){
                total = this.resultados[i];
            }
        }
        return total;
    }
    public int tempoMedio(){
        int tempoM = 0;
        for(int i = 0; i < this.resultados.length; i++){
            tempoM += this.resultados[i];
        }
        return tempoM/this.nrPessoas;
    }
    public void numerosAleatorios(){
       for (Pessoa listPessoa : this.listPessoas) {
           listPessoa.setTempoAlimentaca(this.aleatoriar(this.tpMinAlimentacao, this.tpMaxAlimentacao));
       }
    }
    public void fila(){
        this.popularPessoas();
        for(int i = 0; i < this.listPessoas.length;i ++){
            this.servir(0,i);
        }
         
    }
    public void servir(int item,int pessoa){
        if(item < 5){
          
            if(this.itens[item].getQtdAtual() > 0){
                this.listPessoas[pessoa].addTempoBuffet();
                this.itens[item].servir();
                this.servir(item + 1, pessoa);
            }else if(this.itens[item].getQtdAtual() == 0){
                 this.itens[item].repor();
                 this.ajustTempoAtraso(pessoa,item);
                 this.servir(item, pessoa);
            }
           
        }
    }
   public void  ajustTempoAtraso(int pessoaAtual, int itemAtual){
       int cont = (pessoaAtual + itemAtual)-1;
        for(int i = pessoaAtual; i <= cont; i++){
            if(i < this.nrPessoas){
                this.listPessoas[i].addTempoBuffet(); 
            }
             
        }
    }
    public void popularPessoas(){
        for(int i = 0;i < this.listPessoas.length; i++){
            this.listPessoas[i] = new Pessoa();
            this.listPessoas[i].setTempoBuffet(2);
        }
    }
    public int aleatoriar(int minimo, int maximo) {
    Random random = new Random();
    return random.nextInt((maximo - minimo) + 1) + minimo;
}
    /**
     * @return the nrPessoas
     */
    public int getNrPessoas() {
        return nrPessoas;
    }

    /**
     * @param nrPessoas the nrPessoas to set
     */
    public void setNrPessoas(int nrPessoas) {
        this.nrPessoas = nrPessoas;
    }

    /**
     * @return the nrPratos
     */
    public int getNrPratos() {
        return nrPratos;
    }

    /**
     * @param nrPratos the nrPratos to set
     */
    public void setNrPratos(int nrPratos) {
        this.nrPratos = nrPratos;
    }

    /**
     * @return the nrSalada
     */
    public int getNrSalada() {
        return nrSalada;
    }

    /**
     * @param nrSalada the nrSalada to set
     */
    public void setNrSalada(int nrSalada) {
        this.nrSalada = nrSalada;
    }

    /**
     * @return the nrCarboidratos
     */
    public int getNrCarboidratos() {
        return nrCarboidratos;
    }

    /**
     * @param nrCarboidratos the nrCarboidratos to set
     */
    public void setNrCarboidratos(int nrCarboidratos) {
        this.nrCarboidratos = nrCarboidratos;
    }

    /**
     * @return the nrProteinas
     */
    public int getNrProteinas() {
        return nrProteinas;
    }

    /**
     * @param nrProteinas the nrProteinas to set
     */
    public void setNrProteinas(int nrProteinas) {
        this.nrProteinas = nrProteinas;
    }

    /**
     * @return the suco
     */
    public int getSuco() {
        return suco;
    }

    /**
     * @param suco the suco to set
     */
    public void setSuco(int suco) {
        this.suco = suco;
    }

    /**
     * @return the tpMinAlimentacao
     */
    public int getTpMinAlimentacao() {
        return tpMinAlimentacao;
    }

    /**
     * @param tpMinAlimentacao the tpMinAlimentacao to set
     */
    public void setTpMinAlimentacao(int tpMinAlimentacao) {
        this.tpMinAlimentacao = tpMinAlimentacao;
    }

    /**
     * @return the tpMaxAlimentacao
     */
    public int getTpMaxAlimentacao() {
        return tpMaxAlimentacao;
    }

    /**
     * @param tpMaxAlimentacao the tpMaxAlimentacao to set
     */
    public void setTpMaxAlimentacao(int tpMaxAlimentacao) {
        this.tpMaxAlimentacao = tpMaxAlimentacao;
    }

    /**
     * @return the bTempoMedio
     */
    public int getbTempoMedio() {
        return bTempoMedio;
    }

    /**
     * @param bTempoMedio the bTempoMedio to set
     */
    public void setbTempoMedio(int bTempoMedio) {
        this.bTempoMedio = bTempoMedio;
    }

    /**
     * @return the bTempoTotal
     */
    public int getbTempoTotal() {
        return bTempoTotal;
    }

    /**
     * @param bTempoTotal the bTempoTotal to set
     */
    public void setbTempoTotal(int bTempoTotal) {
        this.bTempoTotal = bTempoTotal;
    }

    /**
     * @return the getbTempoMinimo
     */
    public int getbTempoMinimo() {
        return bTempoMinimo;
    }

    /**
     * @param setbTempoMinimo the setbTempoMinimo to set
     */
    public void setbTempoMinimo(int bTempoMinimo) {
        this.bTempoMinimo = bTempoMinimo;
    }

    /**
     * @return the getbTempoMaximo
     */
    public int getbTempoMaximo() {
        return bTempoMaximo;
    }

    /**
     * @param setbTempoMaximo the setbTempoMaximo to set
     */
    public void setbTempoMaximo(int bTempoMaximo) {
        this.bTempoMaximo = bTempoMaximo;
    }
    
    
    
}
