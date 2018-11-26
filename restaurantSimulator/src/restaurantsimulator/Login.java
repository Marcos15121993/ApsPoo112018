package restaurantsimulator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * @author Marcos.Barros
 */

public class Login extends Application {

    private Stage stage;
    private Scene scene;
    private AnchorPane pane;
    private Label lbLogin, lbPassword ;
    private TextField txLogin;
    private PasswordField txPassword ;
    private Button btLogar;
    
    @Override
    public void start(Stage stage) {
        this.stage = stage;
        initComponents();
        initLayout();
        iniListeners();
        stage.show();
    }

    public void initComponents() {
        pane = new AnchorPane();
        pane.setPrefSize(400, 300);
        scene = new Scene(pane);
        lbLogin = new Label("Login");
        lbPassword  = new Label("Senha");
        txLogin = new TextField();
        txPassword  = new PasswordField();
        btLogar = new Button("Logar");
        pane.getChildren().addAll(lbLogin, lbPassword , txLogin, txPassword , btLogar);
        stage.setScene(scene);
    }

    public void initLayout() {
        lbLogin.setLayoutX(50);
        lbLogin.setLayoutY(40);
        txLogin.setLayoutX(100);
        txLogin.setLayoutY(40);
        lbPassword.setLayoutX(50);
        lbPassword.setLayoutY(80);
        txPassword.setLayoutX(100);
        txPassword.setLayoutY(80);
        btLogar.setLayoutX(225);
        btLogar.setLayoutY(120);
    }

    public void iniListeners() {
        btLogar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String login = txLogin.getText();
                String Password = txPassword .getText();
                    if ((login.equals("POO"))||(login.equals("poo") || (login.equals("adm")))){
                      new homeScreen().start(stage);
                    }else{
                      System.out.println("Você nao vai fazer cagada"); 
                      Alert dialogoAviso = new Alert(Alert.AlertType.WARNING);
                      dialogoAviso.setTitle("Login");
                      dialogoAviso.setHeaderText("Senha Invalida...");
                      dialogoAviso.setContentText("INFORME O USUARIO CORRETO!");
                      dialogoAviso.showAndWait();
                      new Login().start(stage);
                    }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}