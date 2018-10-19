/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resortprototype;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author ggrab
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelLogin;
    @FXML
    private Button buttonLogin;
    @FXML
    private TextField txtfieldUsername;
    @FXML
    private TextField txtfieldPassword;
    @FXML
    private Button buttonExit;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        labelLogin.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonLogin(ActionEvent event) {
        labelLogin.setText("Login successful");
    }

    @FXML
    private void handleButtonUsername(ActionEvent event) {
        
    }

    @FXML
    private void handleButtonExit(ActionEvent event) {
        System.exit(0);
    }
    
}
