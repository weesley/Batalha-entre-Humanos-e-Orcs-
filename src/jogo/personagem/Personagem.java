package jogo.personagem;

public abstract class Personagem {
    protected int vida = 100;
    private int vitorias;
    private int empate;
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void ganharVida(int vida){
        setVida(getVida() + vida);
    }
    
    public void perderVida(int vida){
        setVida(getVida() - vida);
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
}
