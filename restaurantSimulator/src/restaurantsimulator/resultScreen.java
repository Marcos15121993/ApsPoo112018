/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsimulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import DAO.DAOSimulacoes;

/**
 *
 *
 */
public class resultScreen extends Application {
    
    private Stage       stage;
    private Scene       scene;
    private AnchorPane  pane;
    private Label       lbTelaDeResultado;
    
    
    private Label       lbPessoas , lbPratos , lbSaladas , 
                        lbCarboidratos , lbProteinas , lbSuco , 
                        lbTempoMinimo , lbTempoMaximo , lbTempoTotal , 
                        lbTempoMedio;
    
    private Label       lbQTDPessoas , lbQTDPratos , lbQTDSaladas , 
                        lbQTDCarboidratos , lbQTDProteinas , lbQTDSuco , 
                        lbQTDTempoMinimo , lbQTDTempoMaximo , lbQTDTempoTotal , 
                        lbQTDTempoMedio;
    
  
    private Button      btVoltarPTelaInicial , btSalvarNoBanco;

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
        pane.setPrefSize(800 , 600);
        scene = new Scene(pane);

        
        btVoltarPTelaInicial        = new Button    ("Voltar à Tela Inicial");
        btSalvarNoBanco             = new Button    ("Salvar No Banco");
        lbTelaDeResultado           = new Label     ("Tela de Resultado");
        lbCarboidratos              = new Label     ("Carboidratos: ");
        lbPratos                    = new Label     ("Pratos: ");
        lbPessoas                   = new Label     ("Num.Pessoas: ");
        lbProteinas                 = new Label     ("Proteínas: ");
        lbSaladas                   = new Label     ("Salada: ");
        lbSuco                      = new Label     ("Suco: ");
        lbTempoMaximo               = new Label     ("Tempo Minimo de Alimentação: ");
        lbTempoMinimo               = new Label     ("Tempo Maximo de Alimentação: ");
        lbTempoTotal                = new Label     ("Tempo Total: ");
        lbTempoMedio                = new Label     ("Tempo Medio: ");
        
        
        lbQTDCarboidratos           = new Label     ("Carboidratos: ");
        lbQTDPratos                 = new Label     ("Pratos: ");
        lbQTDPessoas                = new Label     ("Num.Pessoas: ");
        lbQTDProteinas              = new Label     ("Proteínas: ");
        lbQTDSaladas                = new Label     ("Salada: ");
        lbQTDSuco                   = new Label     ("Suco: ");
        lbQTDTempoMaximo            = new Label     ("Tempo Minimo de Alimentação: ");
        lbQTDTempoMinimo            = new Label     ("Tempo Maximo de Alimentação: ");
        lbQTDTempoTotal             = new Label     ("Tempo Total: ");
        lbQTDTempoMedio             = new Label     ("Tempo Medio: ");
        
        
        pane.getChildren().addAll(
            btVoltarPTelaInicial ,
            btSalvarNoBanco ,
            lbTelaDeResultado ,
            lbPessoas ,
            lbPratos ,
            lbSaladas ,
            lbCarboidratos,
            lbProteinas ,
            lbSuco ,
            lbTempoMinimo ,
            lbTempoMaximo ,
            lbTempoTotal ,
            lbTempoMedio ,
            
            lbQTDPessoas , 
            lbQTDPratos , 
            lbQTDSaladas , 
            lbQTDCarboidratos , 
            lbQTDProteinas , 
            lbQTDSuco , 
            lbQTDTempoMinimo , 
            lbQTDTempoMaximo , 
            lbQTDTempoTotal , 
            lbQTDTempoMedio
            );

        stage.setScene(scene);
    }

    public void initLayout() {
        
        lbTelaDeResultado.setLayoutX(10);
        
        lbCarboidratos.setLayoutX(10);
        lbPratos.setLayoutX(        lbCarboidratos.getLayoutX());
        lbPessoas.setLayoutX(       lbCarboidratos.getLayoutX());
        lbProteinas.setLayoutX(     lbCarboidratos.getLayoutX());
        lbSaladas.setLayoutX(       lbCarboidratos.getLayoutX());
        lbSuco.setLayoutX(          lbCarboidratos.getLayoutX());
        lbTempoMaximo.setLayoutX(   lbCarboidratos.getLayoutX());
        lbTempoMinimo.setLayoutX(   lbCarboidratos.getLayoutX());
        lbTempoMedio.setLayoutX(    lbCarboidratos.getLayoutX());
        lbTempoTotal.setLayoutX(    lbCarboidratos.getLayoutX());
       
        lbPessoas.setLayoutY(150);
        lbPratos.setLayoutY(            lbPessoas.getLayoutY()          + 30);
        lbSaladas.setLayoutY(           lbPratos.getLayoutY()           + 30);
        lbCarboidratos.setLayoutY(      lbSaladas.getLayoutY()          + 30);
        lbProteinas.setLayoutY(         lbCarboidratos.getLayoutY()     + 30);
        lbSuco.setLayoutY(              lbProteinas.getLayoutY()        + 30);
        lbTempoMinimo.setLayoutY(       lbSuco.getLayoutY()             + 30);
        lbTempoMaximo.setLayoutY(       lbTempoMinimo.getLayoutY()      + 30);
        lbTempoMedio.setLayoutY(        lbTempoMaximo.getLayoutY()      + 30);
        lbTempoTotal.setLayoutY(        lbTempoMedio.getLayoutY()       + 30);
        
        
        
        lbQTDCarboidratos.setLayoutX(200);
        lbQTDPratos.setLayoutX(         lbQTDCarboidratos.getLayoutX());
        lbQTDPessoas.setLayoutX(        lbQTDCarboidratos.getLayoutX());
        lbQTDProteinas.setLayoutX(      lbQTDCarboidratos.getLayoutX());
        lbQTDSaladas.setLayoutX(        lbQTDCarboidratos.getLayoutX());
        lbQTDSuco.setLayoutX(           lbQTDCarboidratos.getLayoutX());
        lbQTDTempoMaximo.setLayoutX(    lbQTDCarboidratos.getLayoutX());
        lbQTDTempoMinimo.setLayoutX(    lbQTDCarboidratos.getLayoutX());
        lbQTDTempoMedio.setLayoutX(     lbQTDCarboidratos.getLayoutX());
        lbQTDTempoTotal.setLayoutX(    lbQTDCarboidratos.getLayoutX());
       
        lbQTDPessoas.setLayoutY(150);
        lbQTDPratos.setLayoutY(         lbQTDPessoas.getLayoutY()       + 30);
        lbQTDSaladas.setLayoutY(        lbQTDPratos.getLayoutY()        + 30);
        lbQTDCarboidratos.setLayoutY(   lbQTDSaladas.getLayoutY()       + 30);
        lbQTDProteinas.setLayoutY(      lbQTDCarboidratos.getLayoutY()  + 30);
        lbQTDSuco.setLayoutY(           lbQTDProteinas.getLayoutY()     + 30);
        lbQTDTempoMinimo.setLayoutY(    lbQTDSuco.getLayoutY()          + 30);
        lbQTDTempoMaximo.setLayoutY(    lbQTDTempoMinimo.getLayoutY()   + 30);
        lbQTDTempoMedio.setLayoutY(     lbQTDTempoMaximo.getLayoutY()   + 30);
        lbQTDTempoTotal.setLayoutY(     lbQTDTempoMedio.getLayoutY()    + 30);
        
        btSalvarNoBanco.setLayoutX(690);
        btSalvarNoBanco.setLayoutY(570);
        btVoltarPTelaInicial.setLayoutX(10);
        btVoltarPTelaInicial.setLayoutY(btSalvarNoBanco.getLayoutY());
    }

    public void iniListeners() {

        btVoltarPTelaInicial.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new homeScreen().start(stage);

            }
        });
        
        btSalvarNoBanco.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                
                System.out.println("simular");
            }
        });
    }
    
}
