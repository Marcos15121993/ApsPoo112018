package restaurantsimulator;


import DAO.DAOSimulacoes;
import entidades.Algoritmo;
import entidades.simulacao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Marcos_Barros
 */
public class initialSetupScreen extends Application {

    private Stage stage;
    private Scene scene;
    private AnchorPane pane;
    private Label lbTelaDeConfiguracaoInicial;

    private Label lbQTDPessoas, lbQTDPratos, lbQTDSaladas,
            lbQTDCarboidratos, lbQTDProteinas, lbQTDSuco,
            lbTempoMinimo, lbTempoMaximo;

    private TextField txQTDPessoas, txQTDPratos, txQTDSaladas,
            txQTDCarboidratos, txQTDProteinas, txQTDSuco,
            txTempoMinimo, txTempoMaximo;

    private Button btVoltar, btSimular;

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

        btVoltar = new Button("Voltar");
        btSimular = new Button("Simular");
        lbTelaDeConfiguracaoInicial = new Label("Tela de Configuração Inicial");
        lbQTDCarboidratos = new Label("Carboidratos");
        lbQTDPratos = new Label("Pratos");
        lbQTDPessoas = new Label("Num.Pessoas");
        lbQTDProteinas = new Label("Proteínas");
        lbQTDSaladas = new Label("Salada");
        lbQTDSuco = new Label("Suco");
        lbTempoMaximo = new Label("Tempo Minimo de Alimentação");
        lbTempoMinimo = new Label("Tempo Maximo de Alimentação");
        txQTDPessoas = new TextField("Somente Numeros");
        txQTDPratos = new TextField("Somente Numeros");
        txQTDSaladas = new TextField("Somente Numeros");
        txQTDCarboidratos = new TextField("Somente Numeros");
        txQTDProteinas = new TextField("Somente Numeros");
        txQTDSuco = new TextField("Somente Numeros");
        txTempoMinimo = new TextField("Somente Numeros");
        txTempoMaximo = new TextField("Somente Numeros");

        pane.getChildren().addAll(
                btVoltar,
                btSimular,
                lbTelaDeConfiguracaoInicial,
                lbQTDPessoas,
                lbQTDPratos,
                lbQTDSaladas,
                lbQTDCarboidratos,
                lbQTDProteinas,
                lbQTDSuco,
                lbTempoMinimo,
                lbTempoMaximo,
                txQTDPessoas,
                txQTDPratos,
                txQTDSaladas,
                txQTDCarboidratos,
                txQTDProteinas,
                txQTDSuco,
                txTempoMinimo,
                txTempoMaximo
        );

        stage.setScene(scene);
    }

    public void initLayout() {

        lbTelaDeConfiguracaoInicial.setLayoutX(10);

        lbQTDCarboidratos.setLayoutX(10);
        lbQTDPratos.setLayoutX(lbQTDCarboidratos.getLayoutX());
        lbQTDPessoas.setLayoutX(lbQTDCarboidratos.getLayoutX());
        lbQTDProteinas.setLayoutX(lbQTDCarboidratos.getLayoutX());
        lbQTDSaladas.setLayoutX(lbQTDCarboidratos.getLayoutX());
        lbQTDSuco.setLayoutX(lbQTDCarboidratos.getLayoutX());
        lbTempoMaximo.setLayoutX(lbQTDCarboidratos.getLayoutX());
        lbTempoMinimo.setLayoutX(lbQTDCarboidratos.getLayoutX());

        txQTDCarboidratos.setLayoutX(190);
        txQTDPessoas.setLayoutX(txQTDCarboidratos.getLayoutX());
        txQTDPratos.setLayoutX(txQTDCarboidratos.getLayoutX());
        txQTDProteinas.setLayoutX(txQTDCarboidratos.getLayoutX());
        txQTDSaladas.setLayoutX(txQTDCarboidratos.getLayoutX());
        txQTDSuco.setLayoutX(txQTDCarboidratos.getLayoutX());
        txTempoMaximo.setLayoutX(txQTDCarboidratos.getLayoutX());
        txTempoMinimo.setLayoutX(txQTDCarboidratos.getLayoutX());

        lbQTDPessoas.setLayoutY(150);
        lbQTDPratos.setLayoutY(lbQTDPessoas.getLayoutY() + 30);
        lbQTDSaladas.setLayoutY(lbQTDPratos.getLayoutY() + 30);
        lbQTDCarboidratos.setLayoutY(lbQTDSaladas.getLayoutY() + 30);
        lbQTDProteinas.setLayoutY(lbQTDCarboidratos.getLayoutY() + 30);
        lbQTDSuco.setLayoutY(lbQTDProteinas.getLayoutY() + 30);
        lbTempoMinimo.setLayoutY(lbQTDSuco.getLayoutY() + 30);
        lbTempoMaximo.setLayoutY(lbTempoMinimo.getLayoutY() + 30);

        txQTDPessoas.setLayoutY(150);
        txQTDPratos.setLayoutY(txQTDPessoas.getLayoutY() + 30);
        txQTDSaladas.setLayoutY(txQTDPratos.getLayoutY() + 30);
        txQTDCarboidratos.setLayoutY(txQTDSaladas.getLayoutY() + 30);
        txQTDProteinas.setLayoutY(txQTDCarboidratos.getLayoutY() + 30);
        txQTDSuco.setLayoutY(txQTDProteinas.getLayoutY() + 30);
        txTempoMinimo.setLayoutY(txQTDSuco.getLayoutY() + 30);
        txTempoMaximo.setLayoutY(txTempoMinimo.getLayoutY() + 30);

        btSimular.setLayoutX(735);
        btSimular.setLayoutY(570);
        btVoltar.setLayoutX(10);
        btVoltar.setLayoutY(btSimular.getLayoutY());
    }

    public void iniListeners() {

        btVoltar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new homeScreen().start(stage);

            }
        });

        btSimular.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                simulacao s = new simulacao();
                s.setPessoas(Integer.valueOf(txQTDPessoas.getText()));
                s.setPratos(Integer.valueOf(txQTDPratos.getText()));
                s.setSalada(Integer.valueOf(txQTDPratos.getText()));
                s.setCarboidratos(Integer.valueOf(txQTDPratos.getText()));
                s.setProteinas(Integer.valueOf(txQTDPratos.getText()));
                s.setSuco(Integer.valueOf(txQTDPratos.getText()));
                simulacao.setTempoMinimo(Integer.valueOf(txTempoMinimo.getText()));
                simulacao.setTempoMaximo(Integer.valueOf(txTempoMaximo.getText()));
                Algoritmo alg = new Algoritmo ();
                s = alg.metodoSimulador(s);
                
                new resultScreen().start(stage);
            }
        });
    }
}
