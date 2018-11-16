package restaurantsimulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.text.TableView;

/**
 *
 * @author Daniel Dalpasquale
 * @RA 2003244
 *
 */

public class queryScreenResults extends Application {

    private Stage       stage;
    private Scene       scene;
    private AnchorPane  pane;
    private Label       lbTelaDeConsultaDeResultados;
    
    private TableView   tbResultados;
    private TableColumn tcPessoas , tcPratos , tcSalada , tcCarboidratos , 
                        tcProteinas , tcSuco , tcTempoTotal , tcTempoMedio;
    private ComboBox    cbResultados;
    
    private Button      btVoltarTelaInicial;

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
        pane.setPrefSize(800, 600);
        scene = new Scene(pane);
        
        lbTelaDeConsultaDeResultados    = new Label ("Tela de Consulta de Resultados");
        btVoltarTelaInicial             = new Button("Voltar a Tela Inicial");
        
        pane.getChildren().addAll(btVoltarTelaInicial , lbTelaDeConsultaDeResultados);
        stage.setScene(scene);
    }

    public void initLayout() {
        lbTelaDeConsultaDeResultados.setLayoutX(10);
        
        btVoltarTelaInicial.setLayoutX(680);
        btVoltarTelaInicial.setLayoutY(570);
    }

    public void iniListeners() {
        btVoltarTelaInicial.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new homeScreen().start(stage);
            }
        });
    }
}
