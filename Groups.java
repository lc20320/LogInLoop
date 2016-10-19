import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
* 
* Luis Cervantes<br>
* 10/18/16<br>
* This program uses If Else in JavaFX to determine number of people and group size
* 
*/
public class Groups extends Application {
			
	@Override
	public void start(Stage primaryStage) throws Exception {
							
									
	TextInputDialog inputDialog = new TextInputDialog();
	inputDialog.setTitle("People");
	inputDialog.setHeaderText(null);
	inputDialog.setContentText("Enter a number of People");		
	Optional<String> result = inputDialog.showAndWait();
	
	double numPeople = Double.parseDouble(result.get());								
									
	if (numPeople >= (10)) {
		System.out.println("Number of People: "+ numPeople + "\nGroup size: " + numPeople/2);
											
	}else if (numPeople > 3 && numPeople < 10)
		System.out.println("Number of People: " + numPeople + "\nGroup size: " + numPeople/3);	
											
	else 
		System.out.println("You must enter 3 or more.");
											
																
	TextInputDialog inputDialog2 = new TextInputDialog();
	inputDialog2.setTitle("Players");
	inputDialog2.setHeaderText(null);
	inputDialog2.setContentText("Enter a number of Players");		
	Optional<String> result2 = inputDialog2.showAndWait();	
																	
	double numPlayers = Double.parseDouble(result2.get());
																		
	if (numPlayers > 11 && numPlayers < 55) {
		System.out.println("Number of Players: " + numPlayers + "\nTeamSize: " + numPlayers/11);
																			
	}else{
		System.out.println("Number of Players: " + numPlayers + "\nTeamsize: 1");
																					
		}
		}
																							
		public static void main(String [] args) {
		Application.launch(args);					
	}
}	


