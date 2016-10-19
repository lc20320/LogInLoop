
import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * 
 * Luis Cervantes<br>
 * 10/18/16<br>
 * This program prompts the user to log in and will allow up to 3 failed attempts
 * 
 */

public class LogInLoop extends Application {
		
	
	public void start(Stage primaryStage) {

		 int i=0;
		 while (i<3) {

		 		
		TextInputDialog inputDialog = new TextInputDialog();
		inputDialog.setTitle("Login");
		inputDialog.setHeaderText(null);
		inputDialog.setContentText("Enter Username");	
		Optional<String> result = inputDialog.showAndWait();		
		
		
		TextInputDialog inputDialog2 = new TextInputDialog();
		inputDialog2.setTitle("Login");
		inputDialog2.setHeaderText(null);
		inputDialog2.setContentText("Enter Password");	
		Optional<String> result2 = inputDialog2.showAndWait();
		
		String username = "Username";
		String pass = "Pass123";						
		
		
		if (result.get().equals(username) && result2.get().equals(pass)){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login");
			alert.setHeaderText("Login Successful");
			alert.setContentText("Welcome Username!");
			alert.showAndWait();
			System.exit(0);
			
		}else if (result.get().equals(username) && !result2.get().equals(pass)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login");
			alert.setHeaderText("Login Unsuccessful");
			alert.setContentText("Invalid Password");
			alert.showAndWait();
			
		}else if (!result.get().equals(username) && result2.get().equals(pass)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login");
			alert.setHeaderText("Login Unsuccessful");
			alert.setContentText("Invalid Username");
			alert.showAndWait();
	
		}else{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login");
			alert.setHeaderText("Login Unsuccessful");
			alert.setContentText("Invalid Username and Password");
			alert.showAndWait();
		
		}		
		
			i++;
			
		}
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Login");
			alert.setHeaderText("Too many failed login attempts");
			alert.setContentText("Contact an Administrator");
			alert.showAndWait();
	}
}
