package jogo.personagem.orc;
import jogo.personagem.Personagem;

public abstract class Orc extends Personagem {
    private final String classe;
    private final int forca;
    private final int habilidade;
    private final int agilidade;
    

    public Orc(String classe, int forca, int habilidade, int agilidade) {
        this.classe = classe;
        this.forca = forca;
        this.habilidade = habilidade;
        this.agilidade = agilidade; 
    }
    
    public String getClasse() {
        return classe;
    }

    public int getForca() {
        return forca;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getAgilidade() {
        return agilidade;
    }
    
    @Override
    public String toString() {
        return  classe ;
    }
    
}
