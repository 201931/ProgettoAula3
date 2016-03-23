package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.*;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader= new FXMLLoader(getClass().getResource("Sample.fxml"));
			BorderPane root = (BorderPane)loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Controller controller=loader.getController();
			Rubrica rubrica=new Rubrica();
			rubrica.aggiungi(new Voce("Giacomo","giacomo_b","0119481235"));
	        rubrica.aggiungi(new Voce("Nicolo","nicolo_b","0119481354"));
	        rubrica.aggiungi(new Voce("Marco","marco_b","0119481452"));
	        controller.setRubrica(rubrica);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
