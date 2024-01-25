package sunat.gob.pe.ejercicio02g7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
     
    	Button btnActual = new Button ("Actual");
    	btnActual.setPrefSize(85, 25);
    	
    	Button btnProyectado = new Button ("Proyectado");
    	btnProyectado.setPrefSize(85, 25);
    	
    	Button btnEstimado = new Button ("Estimado");
    	btnEstimado.setPrefSize(85, 25);
    	
    	HBox hbox = new HBox(btnActual,btnProyectado,btnEstimado);
    	hbox.setSpacing(5);
    	Insets sangriaHbox = new Insets(10, 0, 0, 0);
    	hbox.setPadding(sangriaHbox); //asignando la sangría para los botones
    	hbox.setAlignment(Pos.BASELINE_CENTER); // alineando el Hbox
    	
    	Label lblData = new Label("Data");
    	Label lblVentas = new Label("Ventas");
    	Label lblMarketing = new Label("Marketing");
    	Label lblDistribucion = new Label("Distribución");
    	//Label lblCostos = new Label("Costos");
    	
    	//lblCostos = "Costos";
    	
    	VBox vbox = new VBox(lblData, lblVentas, lblMarketing, lblDistribucion);//, lblCostos);
    	
        Scene scene = new Scene(vbox, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Grupo 7");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}