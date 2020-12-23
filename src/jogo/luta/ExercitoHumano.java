package jogo.luta;

import java.util.ArrayList;
import java.util.Random;
import jogo.personagem.humano.Arqueiro;
import jogo.personagem.humano.Humano;
import jogo.personagem.humano.Robo;
import jogo.personagem.humano.Soldado;

public final class ExercitoHumano {
    ArrayList<Humano> humanos = new ArrayList<>();

   // Construtor
    public ExercitoHumano() {
        criaExercito();                 
    }
    
    // Cria o exercito humano
    public void criaExercito(){
        int classe;
        Random gerador = new Random();
        
        for(int cont = 0; cont < 100; cont++){
            classe = gerador.nextInt(3);
            switch(classe){
                    case 0: humanos.add(new Arqueiro());
                            break;
                            
                    case 1: humanos.add(new Soldado ());
                            break;
                            
                    case 2: humanos.add(new Robo());     
                            break;
            }
        }
    
    }
    
    // Chama o toString pra apresentar os personagens do exército
    public String apresentaExercito(int cont){
        return humanos.get(cont).toString();  
    }
   
    // Retorna o personagem[indice] do array de humanos
    public Humano getHumano(int indice){
        return this.humanos.get(indice);
    }
    
}    
