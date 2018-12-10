package entidades;

public class itensBuffet {
    private int qtdAtual;
    private int qtsSuportado;

    /**
     * @return the qtdAtual
     */
    public int getQtdAtual() {
        return qtdAtual;
    }

    /**
     * @param qtdAtual the qtdAtual to set
     */
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    /**
     * @return the qtsSuportado
     */
    public int getQtsSuportado() {
        return qtsSuportado;
    }

    /**
     * @param qtsSuportado the qtsSuportado to set
     */
    public void setQtsSuportado(int qtsSuportado) {
        this.qtsSuportado = qtsSuportado;
    }
    public void repor(){
        this.setQtdAtual(this.getQtsSuportado());
    }
    public void servir(){
        this.setQtdAtual(this.getQtdAtual() - 1);
    }
    
}
