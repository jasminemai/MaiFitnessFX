package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.TextAlignment;


public class Main extends Application implements Initializable{
	@FXML public Button createUserButton;
	@FXML public Button logInButton;
	@FXML public Button exitButton;
	@FXML public TextArea textArea;
	@FXML public TextField commandTextField;

	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MaiFitness.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * Create user button and initiates rest of methods.
	 */
	@FXML
	private void userButtonAction(ActionEvent event){
		Stage stage = (Stage) createUserButton.getScene().getWindow();
		stage.close();
		System.out.println("Test");
		Account.createUser();
		System.out.println("Congratulations! Your account has been created! Let's log in!");
		Account.logIn();
		MaiFitness.main();
	}
	/*
	 * Button to initiate user log in
	 */
	@FXML
	private void logInButtonAction(ActionEvent event){
		Stage stage = (Stage) logInButton.getScene().getWindow();
		stage.close();
		Account.logIn();
		MaiFitness.main();	
	}
	/*
	 * Closes program
	 */
	@FXML
	private void exitButtonAction(ActionEvent event){
		System.exit(0);
	}

	public void initialize (java.net.URL location, java.util.ResourceBundle resources) {
		DateFormat format = new SimpleDateFormat("MMMM dd,yyyy");
		Date date = new Date();
		textArea.appendText("\nToday is " + format.format(date)+"\n");
		textArea.appendText(DailyTip.tipsArray());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
