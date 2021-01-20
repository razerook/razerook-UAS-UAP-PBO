/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Computer
 */
public class FXMLDocumentController implements Initializable {
    public TextField textField;
    public Label textLabel;
    
    public void button(ActionEvent actionEvent1) {
        textLabel.setText(textField.getText());
    }
    @FXML
    private TableView<DaftarKehadiran> DaftarHadir;
    @FXML
    private TableColumn<DaftarKehadiran,String>nama;
    @FXML
    private TableColumn<DaftarKehadiran,String>tanggal;
    @FXML
    private Label label;
    
 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
