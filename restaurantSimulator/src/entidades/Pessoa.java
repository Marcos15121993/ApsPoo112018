
package entidades;

public class Pessoa {
    private int tempoBuffet;
    private int tempoAlimentaca;

    /**
     * @return the tempoBuffet
     */
    public int getTempoBuffet() {
        return tempoBuffet;
    }

    /**
     * @param tempoBuffet the tempoBuffet to set
     */
    public void setTempoBuffet(int tempoBuffet) {
        this.tempoBuffet = tempoBuffet;
    }

    /**
     * @return the tempoAlimentaca
     */
    public int getTempoAlimentaca() {
        return tempoAlimentaca;
    }

    /**
     * @param tempoAlimentaca the tempoAlimentaca to set
     */
    public void setTempoAlimentaca(int tempoAlimentaca) {
        this.tempoAlimentaca = tempoAlimentaca;
    }
    public void addTempoBuffet(){
        this.setTempoBuffet(this.getTempoBuffet() + 1);
    }
}
