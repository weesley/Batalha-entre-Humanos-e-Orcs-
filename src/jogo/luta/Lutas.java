
package jogo.luta;

import jogo.personagem.humano.Humano;
import jogo.personagem.orc.Orc;

public class Lutas {
    
    // guarda o resultado da luta correspondente
    private String resultado;         
    
    // "Pega" o humano da luta correspondente
    private Humano humano;
    
    // "Pega" o orc da luta correspondente
    private Orc orc;
    
    // Efetua a luta entre o humano e orc de acordo com a habilidade n 
     public void luta(Humano humano, Orc orc, int n){
       this.humano = humano;
       this.orc = orc;
         
        switch(n){
            case 0: if(humano.getInteligencia() > orc.getForca()){
                        humano.ganharVida(humano.getInteligencia() - orc.getForca());
                        orc.perderVida(humano.getInteligencia() - orc.getForca());
                        setResultado("Vencedor: " + humano.getClasse());
                        humano.setVitorias(1);
                    }
                    else if(humano.getInteligencia() == orc.getForca()){                                                
                        setResultado("Empate! " );
                        humano.setEmpate(1);
                        orc.setEmpate(1);                    
                    }
                    else{          
                        orc.ganharVida(orc.getForca()- humano.getInteligencia());
                        humano.perderVida(orc.getForca()- humano.getInteligencia());                           
                        setResultado("Vencedor: " + orc.getClasse());
                        orc.setVitorias(1);
                    }
                    break;
                    
            case 1: if(humano.getVelocidade() > orc.getHabilidade()){          
                        humano.ganharVida(humano.getVelocidade() - orc.getHabilidade());
                        orc.perderVida(humano.getVelocidade() - orc.getHabilidade());
                        setResultado("Vencedor: " + humano.getClasse());
                        humano.setVitorias(1);
                    }
                    else if(humano.getVelocidade() == orc.getHabilidade()){                        
                        setResultado("Empate!");
                        humano.setEmpate(1);
                        orc.setEmpate(1);
                    }
                    else{          
                        orc.ganharVida(orc.getHabilidade() - humano.getVelocidade());
                        humano.perderVida(orc.getHabilidade() - humano.getVelocidade());                            
                        setResultado("Vencedor: " + orc.getClasse());
                        orc.setVitorias(1);
                    }
                    break;
                    
            case 2: if(humano.getEquipamentos() > orc.getAgilidade()){
                        humano.ganharVida(humano.getEquipamentos() - orc.getAgilidade());
                        orc.perderVida(humano.getEquipamentos() - orc.getAgilidade());                        
                        setResultado("Vencedor: " + humano.getClasse());
                        humano.setVitorias(1);
                    }
                    else if(humano.getEquipamentos() == orc.getAgilidade()){
                        setResultado("Empate!");
                        humano.setEmpate(1);
                        orc.setEmpate(1);
                    }            
                    else{
                        orc.ganharVida( orc.getAgilidade() - humano.getEquipamentos());
                        humano.perderVida(orc.getAgilidade() - humano.getEquipamentos());                        
                        setResultado("Vencedor: " + orc.getClasse());
                        orc.setVitorias(1);
                        
                    }
                   break;     
        }
    }
     
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
    //Retorna os dados da luta correspondente
    @Override
    public String toString() {
        return  humano.getClasse() + " Vs " + orc.getClasse() + "\n" + getResultado() ;
    }
    
}
