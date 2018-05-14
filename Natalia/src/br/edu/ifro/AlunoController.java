/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;

/**
 * FXML Controller class
 *
 * @author 04046875208
 */
public class AlunoController implements Initializable {

    @FXML
    private TextField txtNom;
    private Button btnFermer;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Sauvegarder1(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aula");
        EntityManager em = emf.createEntityManager();
        Aluno aluno1 = new Aluno();
        aluno1.setNome(txtNom.getText());
        
        em.getTransaction().begin();
        em.persist(aluno1);
        em.getTransaction().commit();
    }
    
   

    @FXML
    private void Fermer(ActionEvent event) {
       Stage stage = (Stage) txtNom.getScene().getWindow();
    stage.close();
    }
    
}
