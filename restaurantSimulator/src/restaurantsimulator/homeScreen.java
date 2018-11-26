package restaurantsimulator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Marcos_Barros
 */
public class homeScreen extends Application {

    private Stage       stage;
    private Scene       scene;
    private AnchorPane  pane;
    private Label       lbInitialSetupScreen;
    private Button      btStartSigning, btSearchResults, btExit;

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
        pane.setPrefSize(800 , 300);
        scene = new Scene(pane);
        
        btStartSigning          = new Button    ("     Iniciar Simulação    ");
        btSearchResults         = new Button    ("    Consulta de Resultados       ");
        btExit                  = new Button    ("Sair");
        lbInitialSetupScreen    = new Label     ("Tela Inicial");
        
        pane.getChildren().addAll(btStartSigning , btSearchResults , lbInitialSetupScreen, btExit);
        stage.setScene(scene);
    }

    public void initLayout() {
        lbInitialSetupScreen.setLayoutX(15);
        btStartSigning.setLayoutX(300);
        btStartSigning.setLayoutY(100);
        btSearchResults.setLayoutX(btStartSigning.getLayoutX() );
        btSearchResults.setLayoutY(btStartSigning.getLayoutY() + 40);
        btExit.setLayoutX(700);
        btExit.setLayoutY(250);
    }

    public void iniListeners() {
        btStartSigning.setOnAction(new EventHandler<ActionEvent>() {
            @Override
                public void handle(ActionEvent event) {
                   new initialSetupScreen().start(stage);                
            }
        });

        btSearchResults.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new queryScreenResults().start(stage);
            }
        });
        
        btExit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new Login().start(stage);
            }
        });


    }
}
