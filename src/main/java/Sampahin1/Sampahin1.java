package Sampahin1; // (Sesuaikan dengan package Anda)

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Sampahin1 extends Application { 

    @Override
    public void start(Stage stage) throws IOException {
        
    
        Parent root = FXMLLoader.load(getClass().getResource("/View/DataSampahView.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Aplikasi CRUD Data Sampah"); 
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}