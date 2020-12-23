package jogo.luta;

import java.util.ArrayList;
import java.util.Random;
import jogo.personagem.orc.Demonio;
import jogo.personagem.orc.Mago;
import jogo.personagem.orc.Ogro;
import jogo.personagem.orc.Orc;

public final class ExercitoOrc {
    ArrayList<Orc> orcs = new ArrayList<>();
    Orc vetor[];
   
    // Construtor
    public ExercitoOrc() {
        criaExercito();
    }
    
    // Cria o exercito de orcs
    public void criaExercito(){
        
        int classe;
        Random gerador = new Random();
        
        for(int cont = 0; cont < 100; cont++){
            classe = gerador.nextInt(3);
            
            switch(classe){
                    case 0: orcs.add(new Ogro());
                            break;
                            
                    case 1: orcs.add(new Mago());
                            break;
                            
                    case 2: orcs.add(new Demonio());
                            break;
            }
        }    
    }
    
    // Chama o toString pra apresentar os personagens do exército
    public String apresentaExercito(int cont){
            return orcs.get(cont).toString();
    }
    
    // Retorna o personagem[indice] do array de orcs 
    public Orc getOrc(int indice){
        return this.orcs.get(indice);
    }
      
}
