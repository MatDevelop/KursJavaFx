package odc07.event.handler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFx kurs od podstaw - tworzenie Event Handlera #7
 * 
 * @author ZacznijProgramowac </br>
 *         https://www.youtube.com/watch?v=CmBxR44J_QY
 */
public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Powolanie FXMLLoadra
		FXMLLoader loader = new FXMLLoader();

		// wskazujemy loaderowi gdzie jest formatka do wczytania
		loader.setLocation(this.getClass().getResource("/fxml/odc07/StackPaneWindows.fxml"));

		// z loadera mozna za pomoca metody load() pobrac kontener StackPane,
		// ktory jest podstawa naszej formatki
		StackPane stackPane = loader.load();

		// Jezeli potrzebujemy dostepu do kontrolera obslugujacego formatke
		// mozemy go pobrac z loadera.
		StackPaneController naszController = loader.getController();

		// kontener umieszczamy w scenie
		Scene scene = new Scene(stackPane);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Pierwsze okno");
		primaryStage.show();

	}

}
