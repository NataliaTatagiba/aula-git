/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author 04046875208
 */
public class Video1Controller implements Initializable {
    
    @FXML
    private TextField txtNumero1, txtNumero2, txtResultat;
    
    @FXML
    private Button btnSomme;
    
    @FXML
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
    
}
