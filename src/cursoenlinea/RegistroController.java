package cursoenlinea;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.util.Date;

/**
 * Ventana de Registro
 * @author Carlos Carrillo
 * @author Manuel Hernandez
 * @since 07/05/2018
 */
public class RegistroController implements Initializable {

    @FXML
    private ChoiceBox<String> chb_genero;
    @FXML
    private Button btn_aceptar;
    @FXML
    private Button btn_cancelar;
    @FXML
    private Label emp_nombre;
    @FXML
    private Label emp_mat;
    @FXML
    private Label emp_pat;
    @FXML
    private Label emp_curp;
    @FXML
    private Label emp_fecha;
    @FXML
    private Label emp_genero;
    @FXML
    private DatePicker txt_fecha;
    @FXML
    private TextField txt_nombre;
    @FXML
    private TextField txt_pat;
    @FXML
    private TextField txt_curp;
    @FXML
    private TextField txt_mat;
    @FXML
    private Label lb_error;

    FileInputStream is = null;
    ObjectInputStream as = null;
    ObjectOutputStream os = null;
    FileOutputStream xx = null;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chb_genero.getItems().add("Masculino");
        chb_genero.getItems().add("Femenino");
        chb_genero.setValue("Genero");        
    }    

    @FXML
    private void continuar(MouseEvent event) {
        if(comprobar()){
            Date cumple = new Date(txt_fecha.getValue().getYear(),txt_fecha.getValue().getMonthValue(),txt_fecha.getValue().getDayOfMonth());
            Estudiante estudiante = new Estudiante("","",txt_nombre.getText(),txt_pat.getText(),txt_mat.getText(),txt_curp.getText(),
                chb_genero.getValue(),cumple);
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellidos " + estudiante.getApellidoPaterno() + " " + estudiante.getApellidoMaterno());
            System.out.println("CURP " + estudiante.getCurp());
            System.out.println("Fecha nacimiento " + estudiante.getNacimiento());
            System.out.println("Genero " + estudiante.getGenero());

            try{
                Parent sc = FXMLLoader.load(getClass().getResource("ElegirCurso.fxml"));
                Scene nu = new Scene(sc);
                Stage stage = new Stage();
                stage.setTitle("Elige Cursos");
                stage.setScene(nu);
                stage.show();
            }catch(IOException e){}
      }
    }

    /**
     * Cierra la ventana
     * @author Carlos Carrillo
     * @author Manuel Hernandez
     * @since 10/05/2018
     * @param event Clicl en boton cancelar
     */
    @FXML
    private void cancelar(MouseEvent event) {
        Stage stage = (Stage) btn_cancelar.getScene().getWindow();
        stage.close();
    }
    
    /**
     * Comprobar que no existen campos vacios
     * @author Carlos Carrillo
     * @author Manuel Hernandez
     * @since 10/05/2018
     * @return false Si hay algun campo vacio.
     * @return true Si Todos los campos estan llenos.
     */
    private boolean comprobar(){
        if(txt_nombre.getText().isEmpty() || chb_genero.getSelectionModel().isEmpty() ||
            txt_pat.getText().isEmpty() || txt_mat.getText().isEmpty() || txt_curp.getText().isEmpty() ||
            txt_fecha.getValue() == null){
            
            this.lb_error.setVisible(true);
            if(txt_nombre.getText().isEmpty()){
                emp_nombre.setVisible(true);
            }
            if(chb_genero.getSelectionModel().isEmpty()){
                emp_genero.setVisible(true);
            }
            if(txt_pat.getText().isEmpty()){
                emp_pat.setVisible(true);
            }
            if(txt_mat.getText().isEmpty()){
                emp_mat.setVisible(true);
            }
            if(txt_curp.getText().isEmpty()){
                emp_curp.setVisible(true);
            }
            if(txt_fecha.getValue() == null){
                emp_fecha.setVisible(true);
            }
            return false;
        }
        
        return true;
    }
    
}
