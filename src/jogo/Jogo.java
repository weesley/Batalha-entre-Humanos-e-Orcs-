package jogo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Jogo extends Application  { // implementa o método abstrato start

@Override
public void start(Stage stage) throws Exception {       
    try {
        Parent parent = FXMLLoader.load(getClass().getResource("/guiTela/View.fxml")); 
        Scene scene = new Scene(parent);
        
        stage.setTitle("GUERRA ENTRE RAÇAS");
        //coloco a cena no palco
        stage.setScene(scene);                  
        stage.show();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    
}
    public static void main(String[] args) {
        // Chama o lauch, que é um método estático da classe application, e serve pra iniciar a aplicação javafx
        launch(args);                               
                                                
    }
    
}