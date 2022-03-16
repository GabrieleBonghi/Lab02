/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Dizionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="btnclearText"
    private Button btnclearText; // Value injected by FXMLLoader

    @FXML // fx:id="txtParole"
    private TextField txtParole; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisultato"
    private TextArea txtRisultato; // Value injected by FXMLLoader

    Dizionario diz= new Dizionario();
    
    @FXML
    void handleTranslate(ActionEvent event) {

    	String []parole=txtParole.getText().split(" ");
    	
    	if(parole.length==1) {
    		diz.translate(parole[0]);
    		txtRisultato.setText(diz.translate(parole[0]).toString());
    		
    	} if(parole.length==2) {
    		diz.add(parole[0], parole[1]);
    	}
    	
    	txtParole.clear();
    }

    @FXML
    void handleclearText(ActionEvent event) {
    	txtRisultato.setText("");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnclearText != null : "fx:id=\"btnclearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParole != null : "fx:id=\"txtParole\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
