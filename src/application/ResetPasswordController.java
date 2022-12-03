package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.io.IOException;
import javafx.scene.Node;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class ResetPasswordController {
	
	public TextField answ;
	public TextField use;
	public TextField pass1;
	public TextField pass2;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToSplashScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToMainPage(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void handleResetPassword(ActionEvent event){
		boolean login;
		
		login = true;
		
		if(login) {
			try {
				switchToMainPage(event);
			} catch(IOException ex){
				System.out.println("shux");
			}
		} else {
			try {
				switchToSplashScreen(event);
			} catch(IOException ex){
				System.out.println("shux");
			}
		}
	}
	
	
	public void handleExit(ActionEvent event){
		boolean login;
		
		login = true;
		
		if(login) {
			try {
				switchToMainPage(event);
			} catch(IOException ex){
				System.out.println("shux");
			}
		} else {
			try {
				switchToSplashScreen(event);
			} catch(IOException ex){
				System.out.println("shux");
			}
		}
	}

}