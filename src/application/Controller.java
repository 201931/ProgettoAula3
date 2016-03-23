package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.*;

public class Controller {
	private Rubrica rubrica;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtMail;

    @FXML
    private TextField txtTelefono;

    @FXML
    private Label lblStato;

    @FXML
    private ComboBox<String> cBoxNomi;

    @FXML
    void doCerca(ActionEvent event) {
    	lblStato.setText("");
    	Voce v=rubrica.cerca(this.cBoxNomi.getValue());
    	this.txtNome.setText(v.getNome());
    	this.txtMail.setText(v.getMail());
    	this.txtTelefono.setText(v.getTelefono());

    }

    @FXML
    void doInserisci(ActionEvent event) {
    	if(this.txtNome.getText().equals("")||this.txtTelefono.getText().equals("")) lblStato.setText("Parametri mancanti");
    	else if(rubrica.cerca(txtNome.getText())!=null) lblStato.setText("Impossibile inserire contatto");
    	else{
    		rubrica.aggiungi(new Voce(txtNome.getText(),txtMail.getText(),txtTelefono.getText()));
    		cBoxNomi.getItems().add(txtNome.getText());
    		lblStato.setText("Inserimento corretto");
    	}
    	
    	this.txtMail.clear();
    	this.txtNome.clear();
    	this.txtTelefono.clear();

    }
    
    public void setRubrica(Rubrica rubrica){
    	this.rubrica=rubrica;
    	this.cBoxNomi.getItems().addAll(this.rubrica.getNomi());
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtMail != null : "fx:id=\"txtMail\" was not injected: check your FXML file 'Sample.fxml'.";
        assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'Sample.fxml'.";
        assert lblStato != null : "fx:id=\"lblStato\" was not injected: check your FXML file 'Sample.fxml'.";
        assert cBoxNomi != null : "fx:id=\"cBoxNomi\" was not injected: check your FXML file 'Sample.fxml'.";
        lblStato.setText("");
    }
}
