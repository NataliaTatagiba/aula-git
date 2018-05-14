/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.awt.Button;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

/**
 *
 * @author 04046875208
 */
public class Video1Controller implements Initializable {
    
    @FXML
    private javafx.scene.control.TextField txtNumero1, txtNumero2, txtResultat;
    
    @FXML
    private javafx.scene.control.Button btnSomme;
    @FXML
    private Label label;
    @FXML
    private Menu Inscription;
    
    private void somme(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNumero1.getText());
        Double num2 = Double.parseDouble(txtNumero2.getText());
        Double resul = num1 + num2;
        
        txtResultat.setText(resul.toString());
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OuvrirRegistreÉtudiants(ActionEvent event) {
            try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),400,400);
            Stage stage = new Stage();
            stage.setTitle("Inscription étudiant");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){

        }
    }

    @FXML
    private void FermerLeProjet(ActionEvent event) {
    }
    
}
