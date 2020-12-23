package gui;

import static gui.ViewController.getInstanciaH;
import static gui.ViewController.getInstanciaO;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import jogo.luta.ExercitoHumano;
import jogo.luta.ExercitoOrc;

public class ExercitoHumanoController{
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private TextField textField;
    
    @FXML
    private Button button;
    
    //Quando clicar no botão, após ter colocado o nome do exercito no textField, mostra a composição do exercito correspondente
    @FXML
    public void onBtAction() throws InterruptedException{
       // Pega o texto digitado no textField
       String exercito = textField.getText();
       
       if(exercito.equals("humanos")){
           textArea.appendText("EXÉRCITO DOS HUMANOS\n" );
           ExercitoHumano exercitoHumano = getInstanciaH();   
             
           for(int cont = 0; cont < 100; cont++){
               textArea.appendText(exercitoHumano.apresentaExercito(cont) + "\n");
            }  
       }
       else if(exercito.equals("orcs")){
           textArea.appendText("EXÉRCITO DOS ORCS\n" );
           ExercitoOrc exercitoOrc = getInstanciaO();
          
           for(int cont = 0; cont < 100; cont++){
               textArea.appendText(exercitoOrc.apresentaExercito(cont) + "\n");
            }  
       }
       else{
           textArea.appendText("Digite humanos para mostrar o exercito de humanos e orcs para mostrar o exercito de orcs");
       }
    }
}
