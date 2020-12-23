package jogo.personagem.humano;
import jogo.personagem.Personagem;


public abstract class Humano extends Personagem {
    private final String classe;
    private final int inteligencia;
    private final int velocidade;
    private final int equipamentos;
    

    public Humano(String classe, int inteligencia, int velocidade, int equipamentos) {
        this.classe = classe;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.equipamentos = equipamentos;
    }

    public String getClasse() {
        return classe;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getEquipamentos() {
        return equipamentos;
    }
    
    @Override
    public String toString() {
        return classe ;
    }

}
