package gui;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import jogo.luta.ExercitoHumano;
import jogo.luta.Lutas;
import jogo.luta.ExercitoOrc;

    
public class ViewController implements Initializable  { 
    private static ExercitoHumano instanciaH;
    private static ExercitoOrc instanciaO;
    
    //Serve como flag pra ver se uma luta já ocorreu
    private int numObj;                           
    
    @FXML
    private Button button;
    
    @FXML
    private Button exercito; 
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private Label label;

    public int getNumObj() {
        return numObj;
    }

    public void setNumObj(int numObj) {
        this.numObj += numObj;
    }
    
    public static  void setInstanciaH(){
         instanciaH = new ExercitoHumano();                  
    }
    
    public static  void setInstanciaO(){
            instanciaO = new ExercitoOrc();
    }
    
    public static  ExercitoHumano getInstanciaH(){
        return instanciaH;
    }
    
    public static  ExercitoOrc getInstanciaO(){
        return instanciaO;
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setInstanciaO();
        setInstanciaH();
        
    }
    
    // Método para gerar a luta entre os exércitos 
    public void handleButtonAction(ActionEvent event) throws InterruptedException {
        setNumObj(1);
       
        Random gerador = new Random();
        
        
        if(getNumObj() > 1){
            setInstanciaO();
            setInstanciaH();
            setNumObj(1);
            
        }
       
        
        // inicializo as variaveis 
        ExercitoHumano exercitoHumano = getInstanciaH();
        ExercitoOrc exercitoOrc = getInstanciaO();
        Lutas l1 = new Lutas();
      
        int vidaOrc = 0;
        int vidaHumano = 0;
       
        int vitoriasHumano = 0;
        int vitoriasOrc = 0;
        
        for(int cont = 0; cont < 100; cont++){
            int n = gerador.nextInt(3);
            l1.luta(exercitoHumano.getHumano(cont), exercitoOrc.getOrc(cont), n);
            
            textArea.appendText("Luta" + (cont + 1) +  ": " + l1.toString()  + "\n");
            
            vidaHumano      +=  exercitoHumano.getHumano(cont).getVida();
            vidaOrc        += exercitoOrc.getOrc(cont).getVida();
            vitoriasHumano += exercitoHumano.getHumano(cont).getVitorias();
            vitoriasOrc += exercitoOrc.getOrc(cont).getVitorias();
            
        }
        
        //Imprimi no textArea o resultado final da batalha
        textArea.appendText("                    " + "RESULTADOS\n" + "--------------------------------------------------------\n");
        if(vitoriasHumano > vitoriasOrc){
            textArea.appendText("             " + "HUMANOS " + "ORCS" + "\n" + "Vitórias  " +vitoriasHumano + "              " +      vitoriasOrc +"\n" + "Vida     " + vidaHumano + "         " + vidaOrc + "\n" + "OS HUMANOS VENCERAM\n");
        }
        else if(vitoriasOrc > vitoriasHumano){
            textArea.appendText("             " + "HUMANOS " + "ORCS" + "\n" + "Vitórias  " +vitoriasHumano + "              " +      vitoriasOrc +"\n" + "Vida     " + vidaHumano + "         " + vidaOrc + "\n" + "OS ORCs VENCERAM\n");
        }
        else if(vidaHumano > vidaOrc){
            textArea.appendText("             " + "HUMANOS " + "ORCS" + "\n" + "Vitórias  " +vitoriasHumano + "              " +      vitoriasOrc +"\n" + "Vida     " + vidaHumano + "         " + vidaOrc + "\n" + "OS HUMANOS VENCERAM\n");
        }
        else if(vidaOrc > vidaHumano){
            textArea.appendText("             " + "HUMANOS " + "ORCS" + "\n" + "Vitórias  " +vitoriasHumano + "              " +      vitoriasOrc +"\n" + "Vida     " + vidaHumano + "         " + vidaOrc + "\n" + "OS ORCs VENCERAM\n");
        }
        else{
            textArea.appendText("A guerra empatou! tanto em numero de vitórias como na quantidade de vida de casa exercito!");
        }
        textArea.appendText("--------------------------------------------------------\n");
        
        
        
        
    }
    
    //Tem como função abrir outra tela, para que seja mostrado a composição dos exércitos
    public void exercitoButtonAction(ActionEvent event) throws InterruptedException {
        try {
            Parent parent1 = FXMLLoader.load(getClass().getResource("/guiTela/exercitoHumano.fxml"));
            Scene scene1 = new Scene(parent1);
            Stage stage = new Stage();
            stage.setTitle("APRESENTA EXÉRCITOS ");
            stage.setScene(scene1);
            stage.show();
        }
        
        catch (IOException e) {
        }
    }
     
    
}

    
    
    
    
    
    


    
   
    


