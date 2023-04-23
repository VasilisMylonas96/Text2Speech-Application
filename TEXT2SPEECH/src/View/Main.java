package View;
import Commands.Factory;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
public class Main extends Application {
	public static Factory PRESS=new Factory();;
	private GridPane grid1;
	private Button btn2,btn3,record,recordStop,play;
	private MenuItem menuItem1,menuItem2;
	private MenuButton menuButton;
	private  Stage stage;
	private Scene scene;
	@Override
	public void start(Stage primaryStage) {		
		
		grid1 = new GridPane();
		grid1.setMinHeight(417);
		grid1.setMinWidth(448);
		btn2 = new Button("Exit");
	    btn3 = new Button("Exit");
	    btn3.setMinWidth(400);
	    btn3.setVisible(false);
	    btn2.setTextFill(Color.web("#ff0000"));
	    btn2.setFont(new Font("System", 15));
	    btn2.setStyle("-fx-font-weight: bold");
	    btn2.setDefaultButton(true);
	    btn2.setMaxHeight(31);
	    btn2.setMaxWidth(157);
		play = new Button("Play");
		play.setTextFill(Color.web("#ff9d00"));
	    play.setFont(new Font("System", 15));
	    play.setStyle("-fx-font-weight: bold");
	    play.setDefaultButton(true);
	    play.setMaxHeight(31);
	    play.setMaxWidth(157);
	    play.setDisable(true);
		recordStop=new Button("StopRecord");
		record = new Button("RecordMoves");
	    record.setTextFill(Color.web("#000000"));
	    record.setFont(new Font("System", 15));
	    record.setStyle("-fx-font-weight: bold");
	    record.setDefaultButton(true);
	    record.setMaxHeight(31);
	    record.setMaxWidth(157);
	    recordStop.setDisable(true);
	    recordStop.setTextFill(Color.web("#00faff"));
	    recordStop.setFont(new Font("System", 15));
	    recordStop.setStyle("-fx-font-weight: bold");
	    recordStop.setDefaultButton(true);
	    recordStop.setMaxHeight(31);
	    recordStop.setMaxWidth(157);
	    menuItem1 = new MenuItem("New");
	    menuItem2 = new MenuItem("Load");
	    menuButton = new MenuButton("File", null, menuItem1, menuItem2);
	    menuButton.setMaxHeight(31);
	    menuButton.setMaxWidth(157);
	    menuButton.setStyle("-fx-font-weight: bold");
	    menuButton.setTextFill(Color.web("#8400ff"));
	    menuButton.setFont(new Font("System", 15));
	    grid1.add(btn2,6,0);
	    grid1.add(recordStop,5,0);
	    grid1.add(btn3,2, 0);
	    grid1.add(record,4,0);
	    grid1.add(menuButton, 0,0);
	    grid1.add(play, 3, 0);
	    stage = new Stage();
		stage.setTitle("Text2SpeechEditor Main Menu");
		stage.show();				
		scene=new Scene(grid1);
		stage.setScene(scene);
		stage.centerOnScreen();
		menuItem1.setOnAction(e1 -> {
	    	PRESS.Factorybuttonsaction("MenuNew",null,null,null,null,null,null,null,-1,e1, null, null, null, null);
	    	

		    PRESS.callReplayManager("MenuNew", null, null, null, null, null, null, null, -1, (float)-1, (float)-1, (float)-1,e1,null,null,null,null);
	    });

	    btn2.setOnAction(e2 -> {
	    	PRESS.Factorybuttonsaction("closeStage",stage,null,null,null,null,null,null,-1,e2, null, null, null, null);

	    });
	    menuItem2.setOnAction(e3 -> {
	    	PRESS.Factorybuttonsaction("MenuLoad",null,null,null,null,null,null,null,-1,e3, null, null, null, null);
		    
	    });
	    record.setOnAction(e4 -> {
	    	PRESS.Factorybuttonsaction("True",null,null,null,null,null,null,null,-1,e4, null, null, null, null);
	    	recordStop.setDisable(false);
	    	play.setDisable(true);
	    });
	    recordStop.setOnAction(e5 -> {
	    	PRESS.Factorybuttonsaction("False",null,null,null,null,null,null,null,-1,e5, null, null, null, null);
	    	play.setDisable(false);
	    	recordStop.setDisable(true);
	    });
	    play.setOnAction(e6 -> {
	    	PRESS.PlayTheRecord(e6);
	    });
	    
	    
	    
	}
	public static Factory factRet() {
		return PRESS;
	}
		
	

	public static void main(String[] args) {
		
		launch(args);
	}

}