package cursoenlinea;

import java.io.IOException;
import java.net.URL;
import javafx.stage.Stage;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;

/**
 * Ventana de Login
 * @author Carlos Carrillo
 * @author Manuel Hernandez
 * @since 07/05/2018
 */
public class LoginController implements Initializable {
    
    private Label label;
    @FXML
    private Button btn_ingresar;
    @FXML
    private TextField txt_username;
    @FXML
    private TextField txt_password;
    @FXML
    private Label lb_registrar;
    @FXML
    private Button sfb;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lb_registrar.setCursor(Cursor.HAND);
        
    }
    
    /**
     * Inicia ventana de inicio de Estudiante
     * @author Carlos Carrillo
     * @author Manuel Hernandez
     * @since 07/05/2018
     */
    @FXML
    private void login(MouseEvent event) {

    }
    
    /**
     * Inicia ventana de registro de Cliente
     * @author Carlos Carrillo
     * @author Manuel Hernandez
     * @since 07/05/2018
     */
    @FXML
    private void registrar(MouseEvent event) {
        try{
            Parent sc = FXMLLoader.load(getClass().getResource("Registro.fxml"));
            Scene nu = new Scene(sc);
            Stage stage = new Stage();
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("Registro");
            stage.setScene(nu);
            stage.show();
        }catch(IOException e){}
    }
    
}
