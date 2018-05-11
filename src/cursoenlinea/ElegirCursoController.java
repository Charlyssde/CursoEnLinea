/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoenlinea;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * Ventana de eleccion de Cursos a comprar.
 * @author Manuel Antonio Hernandez Maruri
 * @since 08/Mayo/2018
 * @version Prototipo.
 */
public class ElegirCursoController implements Initializable {
    
    @FXML
    private ComboBox<?> cb_Categoria;

    @FXML
    private ListView<?> list_MisCursos;

    @FXML
    private ListView<?> list_Cursos;

    @FXML
    private Button btn_Cancelar;

    @FXML
    private Button btn_Comprar;

    @FXML
    private Label lbl_Cantidad;
    
    /**
     *  Regresa a la ventana anterior.
     *  @since 08/05/2018
     */
    @FXML
    void cancelarButtonAction(ActionEvent event) {
        // get a handle to the stage
        Stage stage = (Stage) btn_Cancelar.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    @FXML
    void comprarButtonAction(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Pago.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Log In");
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
